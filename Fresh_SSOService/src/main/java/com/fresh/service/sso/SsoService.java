package com.fresh.service.sso;

import com.fresh.common.result.R;

public interface SsoService {
    R login(String username,String password);

    R loginCheck(String token);

    R  loginOut(String token);

}

