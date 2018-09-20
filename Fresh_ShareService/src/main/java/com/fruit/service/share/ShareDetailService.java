package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareDetail;

import java.util.List;

public interface ShareDetailService {
    R save(ShareDetail shareDetail);
<<<<<<< HEAD
    R queryById(int id);
=======
    R queryBySid(int sid);
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5
    R update(ShareDetail shareDetail);
    R delete(int sid);
}
