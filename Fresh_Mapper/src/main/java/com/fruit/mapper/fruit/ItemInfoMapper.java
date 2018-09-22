package com.fruit.mapper.fruit;

import com.fruit.domain.fruit.ItemInfo;

public interface ItemInfoMapper {
    
    /**
     * 新增商品介绍
     * @param itemInfo
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:50
     */
    int insertItemInfo(ItemInfo itemInfo);
    
    /**
     * 修改商品介绍
     * @param itemInfo
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:58
     */
    int updateItemInfo(ItemInfo itemInfo);
    
    /**
     * 修改商品介绍表state
     * @param itemInfo
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:42
     */
    int updateItemInfoState(ItemInfo itemInfo);
   
}