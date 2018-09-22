package com.fruit.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.jedis.JedisClient;

/**
 * 为实现缓存同步，需要在商品修改、新增时对该商品对应的分类/品牌/产地缓存更新，即删除该分类缓存，再查找的时候重新写入缓存
 * 时间关系，这里我们暂时使用手动或定时任务，一段时间内对缓存清除，一定程度上保证更新
 * @author ZhuWenFeng
 */
@Controller
public class RedisController {

    @Autowired
    private JedisClient client;
    
    // 如：前台设置一个按钮，点击，清空所有缓存
    @RequestMapping("reloadRedis.do")
    @ResponseBody
    public String reloadRedis() {
        String flushAll = null;
        try {
             flushAll = client.flushAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 不为空，则清空成功，返回1，否则返回0
        return null != flushAll? "1" : "0";
    }
    
}
