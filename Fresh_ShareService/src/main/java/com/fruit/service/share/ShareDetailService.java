package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareDetail;

import java.util.List;

public interface ShareDetailService {
    R save(ShareDetail shareDetail);
    R queryBySid(int sid);
    R update(ShareDetail shareDetail);
    R delete(int sid);
}
