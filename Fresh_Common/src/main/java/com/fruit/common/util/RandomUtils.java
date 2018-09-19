package com.fruit.common.util;

import java.util.UUID;

public class RandomUtils {
    
    /**
     * 生成随机ID（数字）
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-14 20:47
     */
    public static int getId() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
    
    /**
     * 生成随机码（字母+数字）
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-14 20:47
     */
    public static String getCode(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getId());
        }
    }
}
