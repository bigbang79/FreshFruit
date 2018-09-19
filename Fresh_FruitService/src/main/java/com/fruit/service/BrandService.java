package com.fruit.service;

import java.util.List;

import com.fruit.domain.fruit.Brand;

public interface BrandService {

    /**
     * 新增品牌
     * @param brand
     * @return 新增成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:26
     */
    boolean insertBrand(Brand brand);
    
    /**
     * 通过品牌名查找品牌，用于新增品牌时校验
     * @param brandName
     * @return 查到返回brand，否则返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:54
     */
    Brand getBrandByBrandName(String brandName);
    
    /**
     * 查找所有品牌（By 排列顺序）
     * @return 查到返回包含所有品牌的list，否则返回null
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:02
     */
    List<Brand> listAllBrand();
    
    /**
     * 修改品牌名（最后加权限）
     * @param brandName
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:11
     */
    boolean updateBrandName(String brandName, Integer brandId);
    
    /**
     * 修改品牌的热度（即展示的顺序）
     * @param brandHot
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:29
     */
    boolean updateBrandHot(Integer brandHot, Integer brandId);
    
    /**
     * 修改品牌状态
     * @param state
     * @param brandId
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:48
     */
    boolean updateBrandState(Integer state, Integer brandId);
    
    /**
     * 修改品牌排列顺序
     * @param brandSortOrder
     * @param brandId
     * @return 修改成功返回true，失败返回false
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:51
     */
    boolean updateBrandSortOrder(Integer brandSortOrder, Integer brandId);

}
