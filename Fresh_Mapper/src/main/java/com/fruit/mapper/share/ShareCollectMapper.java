package com.fruit.mapper.share;

import com.fruit.domain.share.ShareCollect;
import org.apache.ibatis.annotations.Update;

public interface ShareCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareCollect record);

    int insertSelective(ShareCollect record);

    ShareCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareCollect record);

    int updateByPrimaryKey(ShareCollect record);
    @Update("update t_sharecollect set flag=2 where id=#{id}")
    int delete(int id);
}