package com.fresh.provider.user;

import com.fresh.common.redis.JedisUtil;
import com.fresh.common.result.R;
import com.fresh.common.util.ResultUtil;
import com.fresh.common.vo.JsonVo;
import com.fresh.domain.User;
import com.fresh.mapper.user.UserMapper;
import com.fresh.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceProvider implements UserService {
   @Autowired
   private UserMapper userMapper;

   @Autowired
   private JedisUtil jedisUtil;

   //注册
    @Override
    public R save(User user) {
        Object uuid=jedisUtil.getStr("uuid");
        if (Objects.equals(uuid,user.getUsercode())){
            return  ResultUtil.createResult(userMapper.insert(user));
        } else {
            return  R.setERROR();
        }

    }

    //检测是否已注册
    @Override
    public R check(String phone) {
        User user=userMapper.selectPhone(phone);
        if (user!=null){
            R.setERROR();
        }
        return R.setOK();
    }
}
