package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareComment;
import com.fruit.mapper.share.ShareCommentMapper;
import com.fruit.service.share.ShareCommentServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShareCommentServiceProvider implements ShareCommentServcie {
    @Autowired
    private ShareCommentMapper mapper;
    @Override
    public R save(ShareComment shareComment) {
        return ResultUtil.createResult(mapper.insert(shareComment));
    }

    @Override
    public R delete(int id) {
        return ResultUtil.createResult(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public R queryByUid(int uid) {
        return new R(1,"用户评论",mapper.selectByUid(uid));
    }

    @Override
    public R queryBySid(int sid) {
        return new R(1,"文章评论",mapper.selectBySid(sid));
    }
}
