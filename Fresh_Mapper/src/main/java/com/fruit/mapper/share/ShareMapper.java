package com.fruit.mapper.share;

import com.fruit.domain.share.Share;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ShareMapper {
    int deleteByPrimaryKey(Integer id);
    //新增
    int insert(Share record);

    int insertSelective(Share record);

    Share selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKey(Share record);

    @Update("update t_share set flag=2 where id=#{id}")
    int update(int id);

    @Select("select count(*) from t_share where flag=1")
    @ResultType(Integer.class)
    Integer countAll();

    @Select("select * from t_share where flag=1 limit page,count")
    @ResultType(Share.class)
    List<Share> selectByPage(@Param("page")int page,@Param("count")int count);
    @Select("select s.* from t_share s left join t_sharecollect sc on s.id=sc.id left join t_user u s.shareuid=u.id where u.id=#{uid}")
    @ResultType(Share.class)
    List<Share> selectByCollect(int uid);

}