package com.fresh.provider.sso;

import com.alibaba.fastjson.JSON;
import com.fresh.common.redis.JedisUtil;
import com.fresh.common.result.R;
import com.fresh.common.util.EncrypUtil;
import com.fresh.domain.User;
import com.fresh.mapper.user.UserMapper;
import com.fresh.service.sso.SsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Service
public class SsoServiceProvider implements SsoService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private  JedisUtil jedisUtil;
    @Override
    public R login(String username, String password) {
        //1、查询数据库
        User user =userMapper.selectByName(username);
        //2.验证登录信息
        if (user!=null){
            if (Objects.equals(password,user.getPassword())){
                //3.生成令牌

                String token=EncrypUtil.md5Pass(user.getUserId().toString(),username);
                System.out.println("@@@@@@@@@@@@@"+token);
                //4.存储登录信息到redis
                jedisUtil.addStr(token, JSON.toJSONString(user),TimeUnit.MINUTES,30);
                String json= jedisUtil.getStr(token);
                System.out.println(json+"eeeeeee");
                //5.令牌记录到cookie 记录到控制器
                    return   new R(101,"登录成功",token);
            }else {
                return  new R(102,"密码出错");
            }
        }else {
            return  new R(103,"用户不存在");
        }

    }

    @Override
    public R loginCheck(String token) {
        if (jedisUtil.isKey(token)){
            //有效
            //return R.setOK();
            //读取redis中的用户信息
            String json= jedisUtil.getStr(token);
             jedisUtil.expire(token,TimeUnit.MINUTES,5);

             return  new R(101,"ok",JSON.parseObject(json,User.class));

        }
        return R.setERROR();
    }

    @Override
    public R loginOut(String token) {
        //删除redis
        System.out.println("qqqqqqqq"+token);
        jedisUtil.delKey(token);
        return R.setOK();
    }


//校验令牌的存在


    //注销


}
