package com.fruit.service;

import com.fruit.domain.fruit.Repertory;

public interface RepertoryService {

    /**
     * 修改商品库存总量 
     * @param repertory
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 14:54
     */
    boolean updateRepertoryItemTotalNum(Repertory repertory);
    
    /**
     * 修改商品库存剩余数量（减一）
     * @param num
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:17
     */
    boolean updateRepertoryItemSurplusNum(Integer itemId);
    
    /**
     * 查询库存信息
     * @param itemId
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:52
     */
    Repertory getRepertory(Integer itemId);
    
    /**
     * 修改库存表state
     * @param repertory
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:33
     */
    boolean updateRepertoryState(Repertory repertory);
}
