package com.fruit.common.vo;

<<<<<<< HEAD
=======
import java.io.Serializable;
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5
import java.util.List;

/**
 * JSON返回结果
 * @author ZhuWenFeng
 * @param <T>
 */
<<<<<<< HEAD
public class R<T> {
=======
public class R<T> implements Serializable {
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5

    private int code;
    
    private String msg;
    
    private List<T> data;

<<<<<<< HEAD
    public R() {
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(int code, String msg, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

=======
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5
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
