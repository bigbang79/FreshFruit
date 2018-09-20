package com.fruit.mapper.share;

import com.fruit.domain.share.ShareDetail;

public interface ShareDetailMapper {
    int deleteBySid(Integer sid);

    int insert(ShareDetail record);

    int insertSelective(ShareDetail record);

    ShareDetail selectBySid(Integer sid);

    int updateByPrimaryKeySelective(ShareDetail record);

    int updateByPrimaryKeyWithBLOBs(ShareDetail record);

    int updateByPrimaryKey(ShareDetail record);
}