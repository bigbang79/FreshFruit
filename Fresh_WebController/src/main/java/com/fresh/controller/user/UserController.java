package com.fresh.controller.user;

import com.fresh.common.miaodiyun.httpApiDemo.IndustrySMS;
import com.fresh.common.redis.JedisUtil;
import com.fresh.common.redis.RandUtil;
import com.fresh.common.result.R;
import com.fresh.domain.User;
import com.fresh.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Controller
public class UserController {


@Autowired
    private UserService userService;
@Autowired
private JedisUtil jedisUtil;


@RequestMapping("usersave.do")
@ResponseBody
    public R save(User user){
    return  userService.save(user);
    }


//发送短信验证码，存放在Redis中
    @RequestMapping("getphone.do")
    @ResponseBody
    public R sendcode(String phone){
        String uuid = RandUtil.getRandNum();
      jedisUtil.addStr("uuid",uuid,TimeUnit.MINUTES,30);

        String smsContent ="【千峰教育练习】您的验证码为{"+ uuid +"}，请于2分钟内正确输入，如非本人操作，请忽略此短信。";


            IndustrySMS.execute(phone,smsContent);
            return R.setOK();

    }


@RequestMapping("usercheck.do")
@ResponseBody
    public  R checkUser(String phone){

        return userService.check(phone);
    }












}
