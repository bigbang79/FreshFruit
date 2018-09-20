package com.fruit.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.common.util.RandomUtils;
import com.fruit.mapper.fruit.CategoryMapper;
import com.fruit.domain.fruit.Category;
import com.fruit.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public boolean insertCategory(Category category) {
        try {
            // 添加随机ID
            category.setCategoryId(RandomUtils.getId());
            return categoryMapper.insertCategory(category) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Category getCategoryName(String categoryName) {
        Category category = categoryMapper.getCategoryName(categoryName);
        return null != category ? category : null;
    }

    @Override
    public List<Category> listAllCategory() {
        List<Category> list = categoryMapper.listAllCategoryOne();
        return list.size() > 0 ? list : null;
    }

    @Override
    public List<Category> listAllCategoryTwoByCategoryParentId(Integer categoryParentId) {
        List<Category> list = categoryMapper.listAllCategoryTwoByCategoryParentId(categoryParentId);
        return list.size() > 0 ? list : null;
    }

    @Override
    public boolean updateCategoryName(String categoryName, String categoryId) {
        try {
            return categoryMapper.updateCategoryName(categoryName, categoryId) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCategorySortOrder(String categorySortOrder, String categoryId) {
        try {
            return categoryMapper.updateCategorySortOrder(categorySortOrder, categoryId) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCategoryState(String categoryState, String categoryId) {
        try {
            return categoryMapper.updateCategoryState(categoryState, categoryId) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
