package com.fruit.mapper.share;

import com.fruit.domain.share.ShareLetter;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShareLetterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareLetter record);

    int insertSelective(ShareLetter record);

    ShareLetter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareLetter record);

    int updateByPrimaryKey(ShareLetter record);

    @Select("select content from t_shareletter where uid=#{uid} and uuid=#{uuid} order by createtime desc limit 0,10")
    @ResultType(ShareLetter.class)
    List<ShareLetter> selectByUid(@Param("uid") int uid,@Param("uuid")int uuid);
}