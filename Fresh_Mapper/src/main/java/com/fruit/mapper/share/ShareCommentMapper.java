package com.fruit.mapper.share;

import com.fruit.domain.share.ShareComment;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShareCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareComment record);

    int insertSelective(ShareComment record);

    ShareComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareComment record);

    int updateByPrimaryKey(ShareComment record);
    @Select("select * from t_sharecomment where flag=1 and uid=#{uid}")
    @ResultType(ShareComment.class)
    List<ShareComment> selectByUid(int uid);
    @Select("select * from t_sharecomment where flag=1 and sid=#{sid}")
    @ResultType(ShareComment.class)
    List<ShareComment> selectBySid(int sid);

}