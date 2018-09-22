package com.fresh.common.util;


import com.fresh.common.result.R;

import java.io.Serializable;

public class ResultUtil {
    public static R createResult(int res){
        if(res>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }
}
