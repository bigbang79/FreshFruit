package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.Share;

import java.util.List;

public interface ShareService {
    R save(Share share);
    R delete(int id);
    R queryBage(int page,int count);
    R queryByCollect(int uid);

}
