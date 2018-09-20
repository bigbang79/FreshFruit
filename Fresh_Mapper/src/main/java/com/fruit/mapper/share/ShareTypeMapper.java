package com.fruit.mapper.share;

import com.fruit.domain.share.ShareType;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShareTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareType record);

    int insertSelective(ShareType record);

    ShareType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareType record);

    int updateByPrimaryKey(ShareType record);
    @Select("select * from t_sharetype where flag=1")
    @ResultType(ShareType.class)
    List<ShareType> queryAll();
}