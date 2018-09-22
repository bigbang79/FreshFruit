package com.fruit.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.vo.R;
import com.fruit.domain.fruit.UserItem;
import com.fruit.service.UserItemService;

@Controller
public class UserItemController {
    
    @Autowired
    private UserItemService userItemService;
    
    /**
     * 新增用户-商品关系
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:10
     */
    @RequestMapping("insertUserItem.do")
    @ResponseBody
    public R<UserItem> insertUserItem(UserItem userItem) {
        R<UserItem> result = new R<UserItem>();
        // 如果属性为空，直接新增失败
        if (null == userItem.getItemId() || null == userItem.getUserId()) {
            result.setCode(0);
            result.setMsg("新增用户-商品关系失败");
        }
        // 新增成功返回true，失败返回false
        boolean flag = userItemService.insertUserItem(userItem);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "新增用户-商品关系成功" : "新增用户-商品关系失败");
        return result;
    }

    /**
     * 修改用户-商品关系
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:30
     */
    @RequestMapping("updateUserItem.do")
    @ResponseBody
    public R<UserItem> updateUserItem(UserItem userItem) {
        R<UserItem> result = new R<UserItem>();
        // 如果属性为空，直接新增失败
        if (null == userItem.getItemId() || null == userItem.getUserId()) {
            result.setCode(0);
            result.setMsg("修改用户-商品关系失败");
        }
        // 新增成功返回true，失败返回false
        boolean flag = userItemService.updateUserItem(userItem);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改用户-商品关系成功" : "修改用户-商品关系失败");
        return result;
    }
    
    /**
     * 查询商品的【喜欢数】【评论数】【购买数】【分享数】【收藏数】，按条件查
     * 比如：传进来的userItem中isbuy=1，则返回该商品的购买数
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:47
     */
    @RequestMapping("countUserItemByCondition.do")
    @ResponseBody
    public R<UserItem> countUserItemByCondition(UserItem userItem) {
        R<UserItem> result = new R<UserItem>();
        // 如果属性为空，直接新增失败
        if (null == userItem.getItemId()) {
            result.setCode(0);
            result.setMsg("查询失败");
        }
        int count = userItemService.countUserItemByCondition(userItem);
        result.setCode(count);
        result.setMsg(count > 0 ? "查询成功" : "查询失败或还没有该信息");
        return result;
    }
    
    /**
     * 用户查询【我的收藏】【我的购买】【我的评论】【我的分享】【我的喜欢】
     * 比如：传进来的userItem中isbuy=1，则返回该用户购买过的商品
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:04
     */
    @RequestMapping("listUserItemByUserId.do")
    @ResponseBody
    public R<UserItem> listUserItemByUserId(UserItem userItem) {
        R<UserItem> result = new R<UserItem>();
        // 如果属性为空，直接新增失败
        if (null == userItem.getUserId()) {
            result.setCode(0);
            result.setMsg("查询失败");
        }
        List<UserItem> list = userItemService.listUserItemByUserId(userItem);
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list ? "查询成功" : "查询失败");
        result.setData(list);
        return result;
    }
    
    /**
     * 查询该商品总星数（所有用户给的星）
     * @param itemId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:16
     */
    @RequestMapping("countItemTotalStar.do")
    @ResponseBody
    public R<UserItem> countItemTotalStar(Integer itemId) {
        R<UserItem> result = new R<UserItem>();
        // 如果属性为空，直接新增失败
        if (null == itemId) {
            result.setCode(0);
            result.setMsg("查询失败");
        }
        int totalStar = userItemService.countItemTotalStar(itemId);
        result.setCode(totalStar);
        result.setMsg(totalStar > 0 ? "查询成功" : "查询失败或还没有用户评星");
        return result;
    }
    
    /**
     * 修改用户-商品表状态
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:31
     */
    @RequestMapping("updateUserItemState.do")
    @ResponseBody
    public R<UserItem> updateUserItemState(UserItem userItem) {
        R<UserItem> result = new R<UserItem>();
        // 如果属性为空，直接新增失败
        if (null == userItem.getUserItemId()) {
            result.setCode(0);
            result.setMsg("修改state失败");
        }
        // 新增成功返回true，失败返回false
        boolean flag = userItemService.updateUserItemState(userItem);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改state成功" : "修改state失败");
        return result;
    }

}
