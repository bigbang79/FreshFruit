package com.fruit.service;

import java.util.List;

import com.fruit.domain.fruit.Category;

public interface CategoryService {

    /**
     * 新增分类
     * @param category
     * @return 添加成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 14:32
     */
    boolean insertCategory(Category category);
    
    /**
     * 通过分类名查找分类，用于新增分类时校验
     * @param categoryName
     * @return 查到返回该分类，否则返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:19
     */
    Category getCategoryName(String categoryName);
    
    /**
     * 查找所有一级分类信息
     * @return 查找到返回包含所有分类信息的list，否则返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:30
     */
    List<Category> listAllCategory();
    
    /**
     * 查找二级分类信息（根据父ID）
     * @param categoryParentId
     * @return 查找到返回包含该一级分类下所有二级分类信息的list，否则返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-18 19:46
     */
    List<Category> listAllCategoryTwoByCategoryParentId(Integer categoryParentId);
    
    /**
     * 修改分类名（最后加权限）
     * @param categoryName
     * @param categoryId
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:03
     */
    boolean updateCategoryName(String categoryName, String categoryId);
    
    /**
     * 修改分类的排列序号（即展示的顺序）
     * @param categorySortOrder
     * @param categoryId
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:08
     */
    boolean updateCategorySortOrder(String categorySortOrder, String categoryId);
    
    /**
     * 修改分类状态
     * @param categoryState
     * @param categoryId
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:17
     */
    boolean updateCategoryState(String categoryState, String categoryId);
}
