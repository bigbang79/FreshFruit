package com.fresh.controller.sso;

import com.fresh.common.result.R;
import com.fresh.common.util.CookieUtil;
import com.fresh.service.sso.SsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SsoController {

    @Autowired
    private SsoService ssoService;

    //登录
    @RequestMapping("ssologin.do")
    public R login(String username, String password, HttpServletRequest request, HttpServletResponse response){
        String token=CookieUtil.getCk(request,"userauth");
        System.out.println("o!!!!!!!!!!!"  + token);
        if (token==null){
            R r=ssoService.login(username,password);
            System.out.println(r+"tttttttttt");

            if (r.getCode()==101){
                //登录成功，将令牌存储到cookie中
                System.out.println("登录成功，将令牌存储到cookie中"+r.getData().toString());
                CookieUtil.setCK(response,"userauth",r.getData().toString());

            }
            return  r;
        }else {
            //检查
            return  ssoService.loginCheck(token);
        }

    }


    //检查
@RequestMapping("ssologincheck.do")
    public  R logincheck(HttpServletRequest request, HttpServletResponse response){
    String token=CookieUtil.getCk(request,"userauth");
    if(token!=null) {
        return ssoService.loginCheck(token);
    }else {
        return R.setERROR();
    }


    }
    //注销
    @RequestMapping("/ssologinout.do")
    public R loginout( HttpServletRequest request, HttpServletResponse response) {

        String token=CookieUtil.getCk(request,"userauth");
        System.out.println("vvvvv"+token);
        CookieUtil.delCK(response,"userauth");
        System.out.println("wwwww"+token);
        return ssoService.loginOut(token);
    }

    @RequestMapping("test.do")
    public R test() {
        return R.setOK();
    }


}
