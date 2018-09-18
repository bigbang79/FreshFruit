package com.fruit.mapper.share;

import com.fruit.domain.share.ShareCollect;

public interface ShareCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareCollect record);

    int insertSelective(ShareCollect record);

    ShareCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareCollect record);

    int updateByPrimaryKey(ShareCollect record);
}