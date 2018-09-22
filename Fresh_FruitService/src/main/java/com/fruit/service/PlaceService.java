package com.fruit.service;

import java.util.List;

import com.fruit.domain.fruit.Place;

public interface PlaceService {

    /**
     * 新增产地
     * @param place
     * @return 新增成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 22:11
     */
    boolean insertPlace(Place place);
    
    /**
     * 修改产地
     * @param place
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 22:24
     */
    boolean updatePlace(Place place);
    
    /**
     * 修改产地state
     * @param place
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:09
     */
    boolean updatePlaceState(Place place);
    
    /**
     * 按条件查找所有商品产地
     * @param place
     * @return 成功返回list，失败返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:40
     */
    List<Place> listPlace(Place place);
}
