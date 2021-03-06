package com.fruit.consumer.car;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonParser;
import com.fruit.common.result.R;
import com.fruit.common.util.CookieUtil;
import com.fruit.domain.car.CarInfo;
import com.fruit.domain.user.User;
import com.fruit.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CarController {
    @Autowired
    private CarService service;

    @RequestMapping("carInfoAdd.do")
    public R carInfoAdd(CarInfo carInfo, HttpServletRequest req) {
        String token = CookieUtil.getCk(req,"user" );
       User user = JSON.parseObject(token, User.class);
       return service.carInfoAdd(carInfo, user.getId());
    }

    @RequestMapping("carInfoUpdate.do")
    public R carInfoUpdate(HttpServletRequest req) {
        String token = CookieUtil.getCk(req,"user" );
        User user = JSON.parseObject(token, User.class);
        return service.carClear(user.getId());
    }

    @RequestMapping("carInfoClear.do")
    public R carInfoClear(HttpServletRequest req) {
        String token = CookieUtil.getCk(req,"user" );
        User user = JSON.parseObject(token, User.class);
        return service.carClear(user.getId());
    }

    @RequestMapping("test.do")
    public R test() {
        User user = new User();
        user.setId(2);
        return new R(1,"OK" ,user );
    }


}
