package com.fruit.mapper.share;

import com.fruit.domain.share.ShareComment;

public interface ShareCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareComment record);

    int insertSelective(ShareComment record);

    ShareComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareComment record);

    int updateByPrimaryKey(ShareComment record);
}