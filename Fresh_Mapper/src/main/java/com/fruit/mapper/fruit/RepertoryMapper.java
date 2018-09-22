package com.fruit.mapper.fruit;

import com.fruit.domain.fruit.Repertory;

public interface RepertoryMapper {
    
    /**
     * 新增库存（在新增一件商品的时候就需要新增一条库存信息）
     * @param repertory
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 14:32
     */
    int insertRepertory(Repertory repertory);
    
    /**
     * 修改商品库存总量 
     * @param repertory
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 14:54
     */
    int updateRepertoryItemTotalNum(Repertory repertory);
    
    /**
     * 修改商品库存剩余数量（减1）
     * @param num
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:17
     */
    int updateRepertoryItemSurplusNum(Integer itemId);
    
    /**
     * 查询库存信息
     * @param itemId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 15:52
     */
    Repertory getRepertory(Integer itemId);
    
    /**
     * 修改库存表state
     * @param repertory
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-19 19:33
     */
    int updateRepertoryState(Repertory repertory);
   
}