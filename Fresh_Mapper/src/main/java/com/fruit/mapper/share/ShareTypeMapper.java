package com.fruit.mapper.share;

import com.fruit.domain.share.ShareType;

public interface ShareTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareType record);

    int insertSelective(ShareType record);

    ShareType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareType record);

    int updateByPrimaryKey(ShareType record);
}