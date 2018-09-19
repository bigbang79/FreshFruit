package com.fruit.mapper.share;

import com.fruit.domain.share.ShareImages;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShareImagesMapper {
    int deleteBySid(Integer sid);

    int insert(ShareImages record);

    int insertSelective(ShareImages record);

    ShareImages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareImages record);

    int updateByPrimaryKey(ShareImages record);
    int save(@Param("list") List<String> photos, @Param("sid") int sid);
    @Select("select * from t_shareimages where sid=#{sid}")
    @ResultType(ShareImages.class)
    List<ShareImages> queryBySid(int sid);
}