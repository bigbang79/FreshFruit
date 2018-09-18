package com.fruit.mapper.share;

import com.fruit.domain.share.ShareLetter;

public interface ShareLetterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareLetter record);

    int insertSelective(ShareLetter record);

    ShareLetter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareLetter record);

    int updateByPrimaryKey(ShareLetter record);
}