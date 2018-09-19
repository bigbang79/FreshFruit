package com.fruit.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.vo.R;
import com.fruit.domain.fruit.Item;
import com.fruit.domain.fruit.ItemImage;
import com.fruit.domain.fruit.ItemInfo;
import com.fruit.domain.fruit.Repertory;
import com.fruit.service.ItemService;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;
    
    /**
     * 新增商品
     * @param item
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 08:45
     */
    @RequestMapping("insertItem.do")
    @ResponseBody
    public R<Item> insertItem(Item item, Repertory repertory) {
        R<Item> result = new R<Item>();
        boolean flag = itemService.insertItem(item, repertory);
        // 新增成功的话，返回新增商品的主键ID
        result.setCode(flag ? item.getItemId() : 0);
        result.setMsg(flag ? "新增商品成功" : "新增商品失败");
        return result;
    }
    
    /**
     * 修改商品条形码、二维码
     * @param item
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:26
     */
    @RequestMapping("updateItemRepertoryAndItemBarcode.do")
    @ResponseBody
    public R<Item> updateItemRepertoryAndItemBarcode(Item item) {
        R<Item> result = new R<Item>();
        boolean flag = itemService.updateItemRepertoryAndItemBarcode(item);
        // 修改成功的话，返回修改商品的主键ID
        result.setCode(flag ? item.getItemId() : 0);
        result.setMsg(flag ? "修改商品成功" : "修改商品失败");
        return result;
    }
    
    /**
     * 新增商品图片
     * @param itemImage
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:40
     */
    @RequestMapping("insertItemImage.do")
    @ResponseBody
    public R<ItemImage> insertItemImage(ItemImage itemImage) {
        R<ItemImage> result = new R<ItemImage>();
        // 如果属性为空，则直接添加失败
        if (null != itemImage.getItemId()) {
            result.setCode(0);
            result.setMsg("新增商品图片失败");
        }
        boolean flag = itemService.insertItemImage(itemImage);
        // 修改成功的话，返回新增商品图片的主键ID
        result.setCode(flag ? itemImage.getItemId() : 0);
        result.setMsg(flag ? "新增商品图片成功" : "新增商品图片失败");
        return result;
    }
    
    /**
     * 修改商品图片
     * @param itemImage
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 09:55
     */
    @RequestMapping("updateItemImage.do")
    @ResponseBody
    public R<ItemImage> updateItemImage(ItemImage itemImage) {
        R<ItemImage> result = new R<ItemImage>();
        // 如果属性为空，则直接修改失败
        if (null != itemImage.getItemId() || null != itemImage.getItemImageId()) {
            result.setCode(0);
            result.setMsg("修改商品图片失败");
        }
        boolean flag = itemService.insertItemImage(itemImage);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改商品图片成功" : "修改商品图片失败");
        return result;
    }
    
    /**
     * 新增商品介绍
     * @param itemInfo
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:03
     */
    @RequestMapping("insertItemInfo.do")
    @ResponseBody
    public R<ItemInfo> insertItemInfo(ItemInfo itemInfo) {
        R<ItemInfo> result = new R<ItemInfo>();
        // 如果属性为空，则直接新增失败
        if (null != itemInfo.getItemId() || null != itemInfo.getItemInfoId()) {
            result.setCode(0);
            result.setMsg("新增商品信息失败");
        }
        boolean flag = itemService.insertItemInfo(itemInfo);
        // 新增成功则返回该商品ID
        result.setCode(flag ? itemInfo.getItemId() : 0);
        result.setMsg(flag ? "新增商品信息成功" : "新增商品信息失败");
        return result;
    }
    
    /**
     * 修改商品信息
     * @param itemInfo
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:04
     */
    @RequestMapping("updateItemInfo.do")
    @ResponseBody
    public R<ItemInfo> updateItemInfo(ItemInfo itemInfo) {
        R<ItemInfo> result = new R<ItemInfo>();
        // 如果属性为空，则直接修改失败
        if (null != itemInfo.getItemId() || null != itemInfo.getItemInfoId()) {
            result.setCode(0);
            result.setMsg("修改商品信息失败");
        }
        boolean flag = itemService.updateItemInfo(itemInfo);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改商品信息成功" : "修改商品信息失败");
        return result;
    }
    
    /**
     * 修改商品状态
     * @param item
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 10:17
     */
    @RequestMapping("updateItemState.do")
    @ResponseBody
    public R<ItemInfo> updateItemState(Item item) {
        R<ItemInfo> result = new R<ItemInfo>();
        // 如果属性为空，则直接修改失败
        if (null != item.getItemId()) {
            result.setCode(0);
            result.setMsg("修改商品状态失败");
        }
        boolean flag = itemService.updateItemState(item);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改商品状态成功" : "修改商品状态失败");
        return result;
    }
    
    /**
     * 通过产地ID查找商品
     * @param placeId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 11:11
     */
    @RequestMapping("listItemByPlcaeId.do")
    @ResponseBody
    public R<Item> listItemByPlcaeId(Integer placeId) {
        R<Item> result = new R<Item>();
        // 如果属性为空，则直接查找失败
        if (null != placeId) {
            result.setCode(0);
            result.setMsg("查找商品失败");
        }
        // 调用服务层方法，方法中包含将该产地下的商品放入Redis中
        List<Item> list = itemService.listItemByPlcaeId(placeId);
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list  ? "查找商品成功" : "查找商品失败");
        result.setData(list);
        return result;
    }
    
    /**
     * 通过产地条件查找商品
     * 如：输如state="河南"，先查询出state="河南"的所有List<Place>
     *      然后遍历List<Place>，抽取placeId，再查找该placeId对应的商品
     * @param placeId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 11:11
     */
    
    
    /**
     * 通过分类ID查找商品，为实现缓存同步，需要在商品修改、新增时对该商品对应的分类缓存更新，即删除该分类缓存，再查找的时候重写写入缓存
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 11:29
     */
    @RequestMapping("listItemByCategoryId.do")
    @ResponseBody
    public R<Item> listItemByCategoryId(Integer categoryId) {
        R<Item> result = new R<Item>();
        // 如果属性为空，则直接查找失败
        if (null != categoryId) {
            result.setCode(0);
            result.setMsg("查找商品失败");
        }
        // 调用服务层方法，方法中包含将该分类下的商品放入Redis中
        List<Item> list = itemService.listItemByCategoryId(categoryId);
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list  ? "查找商品成功" : "查找商品失败");
        result.setData(list);
        return result;
    }
    
    /**
     * 通过品牌ID查找商品
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 11:29
     */
    @RequestMapping("listItemByBrandId.do")
    @ResponseBody
    public R<Item> listItemByBrandId(Integer brandId) {
        R<Item> result = new R<Item>();
        // 如果属性为空，则直接查找失败
        if (null != brandId) {
            result.setCode(0);
            result.setMsg("查找商品失败");
        }
        // 调用服务层方法，方法中包含将该品牌下的商品放入Redis中
        List<Item> list = itemService.listItemByBrandId(brandId);
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list  ? "查找商品成功" : "查找商品失败");
        result.setData(list);
        return result;
    }
    
    /**
     * 修改商品信息表state
     * @param itemInfo
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:44
     */
    @RequestMapping("updateItemInfoState.do")
    @ResponseBody
    public R<Item> updateItemInfoState(ItemInfo itemInfo) {
        R<Item> result = new R<Item>();
        // 如果属性为空，则直接查找失败
        if (null != itemInfo.getItemInfoId() || null != itemInfo.getItemId()) {
            result.setCode(0);
            result.setMsg("修改商品信息state失败");
        }
        // 修改成功返回true，失败返回false
        boolean flag = itemService.updateItemInfoState(itemInfo);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改商品信息state成功" : "修改商品信息state失败");
        return result;
    }
    
    /**
     * 修改商品图片表state
     * @param itemImage
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:48
     */
    @RequestMapping("updateItemImageState.do")
    @ResponseBody
    public R<Item> updateItemImageState(ItemImage itemImage) {
        R<Item> result = new R<Item>();
        // 如果属性为空，则直接查找失败
        if (null != itemImage.getItemImageId() || null != itemImage.getItemId()) {
            result.setCode(0);
            result.setMsg("修改商品照片state失败");
        }
        // 修改成功返回true，失败返回false
        boolean flag = itemService.updateItemImageState(itemImage);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改商品照片state成功" : "修改商品照片state失败");
        return result;
    }
    
    /**
     * 通过itemName模糊查询（暂时先实现功能，现在还不会es搜索）
     * @param itemName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 20:08
     */
    @RequestMapping("listItemByItemNameLike.do")
    @ResponseBody
    public R<Item> listItemByItemNameLike(String itemName){
        R<Item> result = new R<Item>();
        if (null == itemName || "".equals(itemName)) {
            result.setCode(0);
            result.setMsg("模糊查询失败");
        }
        List<Item> list = itemService.listItemByItemNameLike(itemName);
        result.setCode(null != list? 1 : 0);
        result.setMsg(null != list? "模糊查询成功" : "模糊查询失败");
        return result;
    }
    
    // 为实现缓存同步，需要在商品修改、新增时对该商品对应的分类/品牌/产地缓存更新，即删除该分类缓存，再查找的时候重写写入缓存
    // 这里我们暂时使用手动或采用定时任务，一段时间内对缓存清除，一定程度上保证更新

    
}
