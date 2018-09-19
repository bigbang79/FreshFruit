package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareComment;

import java.util.List;

public interface ShareCommentServcie {
    R save(ShareComment shareComment);
    R delete(int id);
    R queryByUid(int uid);
    R queryBySid(int sid);
}
