package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareLetter;

public interface ShareLetterService {
    R save(ShareLetter shareLetter);
    R delete(int id);
    public R qureyByUid(int uid,int uuid);
}
