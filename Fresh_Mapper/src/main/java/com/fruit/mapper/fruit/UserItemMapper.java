package com.fruit.mapper.fruit;

import java.util.List;

import com.fruit.domain.fruit.UserItem;

public interface UserItemMapper {
    
    /**
     * 新增用户-商品关系
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:24
     */
    int insertUserItem(UserItem userItem);
    
    /**
     * 修改用户-商品关系
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:29
     */
    int updateUserItem(UserItem userItem);
    
    /**
     * 查询商品的被分享数、被收藏数等等（通过条件）
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 17:43
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
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:13
     */
    int countItemTotalStar(Integer itemId);
    
    /**
     * 修改state
     * @param userItem
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:27
     */
    int updateUserItemState(UserItem userItem);
    
}