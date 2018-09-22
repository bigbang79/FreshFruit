package com.fresh.common.vo;

import java.util.List;

public class JsonVo<T> {
    private  int code;
    private  String msg;
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

    public JsonVo() {
    }

    public JsonVo(int code, String msg, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    static  JsonVo jsonVo;
    public static<M>  JsonVo<M> R(int code,String msg,List<M> data){
      jsonVo=  new JsonVo();
      jsonVo.setCode(code);
      jsonVo.setMsg(msg);
      jsonVo.setData(data);
      return  jsonVo;
    }

}
