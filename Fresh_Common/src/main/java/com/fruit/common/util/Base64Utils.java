package com.fruit.common.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Utils {

    /**
     * base64加密
     * @param key
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-14 21:11
     */
    public static String encryptBASE64(String key) {
        byte[] bt = key.getBytes();
        return (new BASE64Encoder()).encodeBuffer(bt);
    }

    /**
     * BASE64解密
     * @param key
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-14 21:13
     */
    public static String decryptBASE64(String key) {
        byte[] bt;
        try {
            bt = (new BASE64Decoder()).decodeBuffer(key);
            return new String(bt, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static void main(String[] args) {
        System.out.println(encryptBASE64("123"));
        System.out.println(decryptBASE64("MTIz"));
    }
    
}
