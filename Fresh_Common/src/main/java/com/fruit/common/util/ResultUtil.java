package com.fruit.common.util;

import com.fruit.common.result.R;

/**
 *@Author feri
 *@Date Created in 2018/9/4 16:39
 */
public class ResultUtil {
    public static R createResult(int res){
        if(res==1){
            return R.setOK();
        }else {
            return R.setError();
        }
    }
}
