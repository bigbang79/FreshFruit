package com.fruit.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.vo.R;
import com.fruit.domain.fruit.Category;
import com.fruit.service.CategoryService;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    
    /**
     * 新增分类
     * @param category
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:21
     */
    @RequestMapping("insertCategory.do")
    @ResponseBody
    public R<Category> insertCategory(Category category) {
        R<Category> result = new R<Category>();
        // 如果category的属性为空（分类名或分类父ID）
        if (null == category.getCategoryName() || "".equals(category.getCategoryName()) || null == category.getCategoryParentId()) {
            result.setCode(0);
            result.setMsg("添加分类失败");
            return result;
        }
        // 调用Service方法，在Service层对Category的categoryId修改
        boolean flag = categoryService.insertCategory(category);
        System.out.println(category.getCategoryId());
        // 修改成功返回新增的商品分类ID
        result.setCode(flag ? category.getCategoryId() : 0);
        result.setMsg(flag ? "添加分类成功" : "添加分类失败");
        return result;
    }
    
    /**
     * 通过分类名查找分类，用于新增分类时校验
     * @param categoryName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:24
     */
    @RequestMapping("getCategoryName.do")
    @ResponseBody
    public R<Category> getCategoryName(String categoryName) {
        R<Category> result = new R<Category>();
        // 如果category不为空，则该categoryName已被使用
        Category category = categoryService.getCategoryName(categoryName);
        result.setCode(null != category ? 1 : 0);
        result.setMsg(null != category ? "分类已存在" : "分类可以使用");
        return result;
    }
    
    /**
     * 查找所有一级分类
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 16:36
     */
    @RequestMapping("listAllCategoryOne.do")
    @ResponseBody
    public R<Category> listAllCategoryOne() {
        R<Category> result = new R<Category>();
        // 查找所有的一级分类，查找到返回包含所有分类信息的list，否则返回null
        List<Category> list = categoryService.listAllCategory();
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list ? "所有一级分类查找成功" : "有一级分类查找失败");
        result.setData(list);
        return result;
    }
    
    /**
     * 查找二级分类信息（根据父ID）
     * @param categoryParentId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 19:53
     */
    @RequestMapping("listAllCategoryTwoByCategoryParentId.do")
    @ResponseBody
    public R<Category> listAllCategoryTwoByCategoryParentId(Integer categoryParentId) {
        R<Category> result = new R<Category>();
        // 查找到返回包含该一级分类下所有二级分类信息的list，否则返回null
        List<Category> list = categoryService.listAllCategoryTwoByCategoryParentId(categoryParentId);
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list ? "二级分类查找成功" : "该分类下还没有二级分类");
        result.setData(list);
        return result;
    }
    
    /**
     * 修改分类名
     * @param categoryName
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:06
     */
    @RequestMapping("updateCategoryName.do")
    @ResponseBody
    public R<Category> updateCategoryName(String categoryName, String categoryId) {
        R<Category> result = new R<Category>();
        // 修改成功返回true，失败返回false
        boolean flag = categoryService.updateCategoryName(categoryName, categoryId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改分类成功" : "修改分类失败");
        return result;
    }
    
    /**
     * 修改排列序号
     * @param categorySortOrder
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:10
     */
    @RequestMapping("updateCategorySortOrder.do")
    @ResponseBody
    public R<Category> updateCategorySortOrder(String categorySortOrder, String categoryId) {
        R<Category> result = new R<Category>();
        // 修改成功返回true，失败返回false
        boolean flag = categoryService.updateCategorySortOrder(categorySortOrder, categoryId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改排列序号成功" : "修改排列序号失败");
        return result;
    }
    
    /**
     * 修改分类状态
     * @param categoryState
     * @param categoryId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:19
     */
    @RequestMapping("updateCategoryState.do")
    @ResponseBody
    public R<Category> updateCategoryState(String categoryState, String categoryId) {
        R<Category> result = new R<Category>();
        // 修改成功返回true，失败返回false
        boolean flag = categoryService.updateCategoryState(categoryState, categoryId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改分类状态成功" : "修改分类状态失败");
        return result;
    }

}
