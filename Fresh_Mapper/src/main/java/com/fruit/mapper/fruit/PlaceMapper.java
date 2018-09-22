package com.fruit.mapper.fruit;

import java.util.List;

import com.fruit.domain.fruit.Place;

public interface PlaceMapper {
    
    /**
     * 新增产地
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 22:11
     */
    int insertPlace(Place place);  
    
    /**
     * 修改产地
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 22:24
     */
    int updatePlace(Place place);
    
    /**
     * 修改产地state
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:09
     */
    int updatePlaceState(Place place);
    
    /**
     * 按条件查找所有商品产地
     * @param place
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:40
     */
    List<Place> listPlace(Place place);
   
    
}