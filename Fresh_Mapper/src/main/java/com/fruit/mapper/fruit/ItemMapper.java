package com.fruit.mapper.fruit;

import java.util.List;

import com.fruit.domain.fruit.Item;

public interface ItemMapper {
    
    /**
     * 新增商品
     * @param item
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 08:38
     */
    int insertItem(Item item);
    
    /**
     * 修改商品条形码、二维码
     * @param item
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 08:58
     */
    int updateItemRepertoryAndItemBarcode(Item item);
    
    /**
     * 修改商品state
     * @param item
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:14
     */
    int updateItemState(Item item);
    
    /**
     * 查找商品（通过商品ID）
     * @param itemId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:21
     */
    Item getItemByItemId(Integer itemId);
    
    /**
     * 查找商品（通过产地ID）
     * @param placeId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:42
     */
    List<Item> listItemByPlcaeId(Integer placeId);
    
    /**
     * 查找商品（通过分类ID）
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:52
     */
    List<Item> listItemByCategoryId(Integer categoryId);
    
    /**
     * 查找商品（通过品牌ID）
     * @param brandId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:52
     */
    List<Item> listItemByBrandId(Integer brandId);
    
    /**
     * 通过itemName模糊查询（暂时先实现功能，现在还不会es搜索）
     * @param itemName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:59
     */
    List<Item> listItemByItemNameLike(String itemName);
    
}