package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareLetter;

public interface ShareLetterService {
    R save(ShareLetter shareLetter);
    R delete(int id);
<<<<<<< HEAD
=======
    public R qureyByUid(int uid,int uuid);
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5
}
