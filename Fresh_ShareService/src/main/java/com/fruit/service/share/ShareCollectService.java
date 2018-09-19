package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareCollect;

public interface ShareCollectService {
    R save(ShareCollect shareCollect);
    R delete(int id);
}
