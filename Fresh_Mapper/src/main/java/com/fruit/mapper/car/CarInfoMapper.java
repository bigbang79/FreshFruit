package com.fruit.mapper.car;

import com.fruit.domain.car.CarInfo;
import org.apache.ibatis.annotations.Param;

public interface CarInfoMapper {
    Integer insert(CarInfo record);

    Integer deleteByCid(Integer cid);

    Integer deleteById(Integer id);

    CarInfo selectByCidGid(@Param("cid") Integer cid,@Param("gid") Integer gid);

    Integer updateCount(@Param("id") Integer id,@Param("flag")Integer flag);

}