package com.fruit.common.vo;

import java.util.List;

/**
 * JSON返回结果
 * @author ZhuWenFeng
 * @param <T>
 */
public class R<T> {

    private int code;
    
    private String msg;
    
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
    
}
