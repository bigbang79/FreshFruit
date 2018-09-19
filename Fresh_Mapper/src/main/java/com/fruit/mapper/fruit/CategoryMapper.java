package com.fruit.mapper.fruit;

import java.util.List;

import com.fruit.domain.fruit.Category;

public interface CategoryMapper {
    
    /**
     * 新增分类
     * @param category
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 14:29
     */
    int insertCategory(Category category);
    
    /**
     * 通过分类名查找分类，用于新增分类时校验
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:18
     */
    Category getCategoryName(String categoryName);
    
    /**
     * 查找所有一级分类信息
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:30
     */
    List<Category> listAllCategoryOne();
    
    /**
     * 查找二级分类信息（根据父ID）
     * @param categoryParentId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 19:45
     */
    List<Category> listAllCategoryTwoByCategoryParentId(Integer categoryParentId);
    
    /**
     * 修改分类名（最后加权限）
     * @param categoryName
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:03
     */
    int updateCategoryName(String categoryName, String categoryId);

    /**
     * 修改分类的排列序号（即展示的顺序）
     * @param categorySortOrder
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:08
     */
    int updateCategorySortOrder(String categorySortOrder, String categoryId);
    
    /**
     * 修改分类状态
     * @param categoryState
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:17
     */
    int updateCategoryState(String categoryState, String categoryId);

}