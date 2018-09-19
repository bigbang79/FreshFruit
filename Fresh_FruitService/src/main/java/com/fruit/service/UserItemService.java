package com.fruit.service;

import java.util.List;

import com.fruit.domain.fruit.UserItem;

public interface UserItemService {

    /**
     * 新增用户-商品关系
     * @param userItem
     * @return 新增成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:03
     */
    boolean insertUserItem(UserItem userItem);
    
    /**
     * 修改用户-商品关系
     * @param userItem
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:29
     */
    boolean updateUserItem(UserItem userItem);
    
    /**
     * 通过userItem中哪个属性不为null，判断查该属性为1的数量
     * 比如：只有userItem.isbuy != null同时isboy=1 就查出isbuy=1的数量
     * @param userItem
     * @return 
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:44
     */
    int countUserItemByCondition(UserItem userItem);
    
    /**
     * 用户查询【我的收藏】【我的购买】【我的评论】【我的分享】等
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 18:57
     */
    List<UserItem> listUserItemByUserId(UserItem userItem);
    
    /**
     * 查询商品总星数（所有用户给的星）
     * @param itemId
     * @return 商品总星数
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:13
     */
    int countItemTotalStar(Integer itemId);
    
    /**
     * 修改state
     * @param userItem
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:27
     */
    boolean updateUserItemState(UserItem userItem);
}
