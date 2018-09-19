package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareType;

import java.util.List;

public interface ShareTypeService {
    R save(ShareType shareType);
    R delete(int id);
    R queryAll();
}
