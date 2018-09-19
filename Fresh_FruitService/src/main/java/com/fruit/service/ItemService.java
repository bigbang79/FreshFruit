package com.fruit.service;

import java.util.List;

import com.fruit.domain.fruit.Item;
import com.fruit.domain.fruit.ItemImage;
import com.fruit.domain.fruit.ItemInfo;
import com.fruit.domain.fruit.Repertory;

public interface ItemService {

    /**
     * 新增商品
     * @param item
     * @return 新增成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 08:38
     */
    boolean insertItem(Item item, Repertory repertory);
    
    /**
     * 修改商品条形码、二维码
     * @param item
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 08:58
     */
    boolean updateItemRepertoryAndItemBarcode(Item item);
    
    /**
     * 新增商品图片
     * @param image
     * @return 新增成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:34
     */
    boolean insertItemImage(ItemImage itemImage);
    
    /**
     * 修改商品图片
     * @param itemImage
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:52
     */
    boolean updateItemImage(ItemImage itemImage);
    
    /**
     * 新增商品介绍
     * @param itemInfo
     * @return 新增成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:50
     */
    boolean insertItemInfo(ItemInfo itemInfo);
    
    /**
     * 修改商品介绍
     * @param itemInfo
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:58
     */
    boolean updateItemInfo(ItemInfo itemInfo);
    
    /**
     * 修改商品state
     * @param item
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:14
     */
    boolean updateItemState(Item item);
    
    /**
     * 查找商品（通过产地ID）
     * @param placeId
     * @return 成功返回list，失败返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:42
     */
    List<Item> listItemByPlcaeId(Integer placeId);
    
    /**
     * 查找商品（通过分类ID）
     * @param categoryId
     * @return 成功返回list，失败返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:52
     */
    List<Item> listItemByCategoryId(Integer categoryId);
    
    /**
     * 查找商品（通过品牌ID）
     * @param brandId
     * @return 成功返回list，失败返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:52
     */
    List<Item> listItemByBrandId(Integer brandId);
    
    /**
     * 修改商品介绍表state
     * @param itemInfo
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:42
     */
    boolean updateItemInfoState(ItemInfo itemInfo);
    
    /**
     * 修改商品图片state
     * @param itemImage
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:46
     */
    boolean updateItemImageState(ItemImage itemImage);
    
    /**
     * 通过itemName模糊查询（暂时先实现功能，现在还不会es搜索）
     * @param itemName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:59
     */
    List<Item> listItemByItemNameLike(String itemName);

}
