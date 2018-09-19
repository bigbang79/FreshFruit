package com.fruit.mapper.fruit;

import com.fruit.domain.fruit.ItemImage;

public interface ItemImageMapper {
    
    /**
     * 新增商品图片
     * @param image
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:34
     */
    int insertItemImage(ItemImage itemImage);
    
    /**
     * 修改商品图片
     * @param itemImage
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:52
     */
    int updateItemImage(ItemImage itemImage);
    
    /**
     * 修改商品图片state
     * @param itemImage
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:46
     */
    int updateItemImageState(ItemImage itemImage);
    
}