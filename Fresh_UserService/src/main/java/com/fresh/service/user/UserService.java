package com.fresh.service.user;

import com.fresh.common.result.R;
import com.fresh.common.vo.JsonVo;
import com.fresh.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

   R save(User user);
   R check(String phone);


}
