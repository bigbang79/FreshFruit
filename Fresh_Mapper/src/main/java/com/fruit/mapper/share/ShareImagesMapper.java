package com.fruit.mapper.share;

import com.fruit.domain.share.ShareImages;

public interface ShareImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareImages record);

    int insertSelective(ShareImages record);

    ShareImages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareImages record);

    int updateByPrimaryKey(ShareImages record);
}