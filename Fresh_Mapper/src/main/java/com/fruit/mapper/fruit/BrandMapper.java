package com.fruit.mapper.fruit;

import com.fruit.domain.fruit.Brand;

import java.util.List;


public interface BrandMapper {
    
    /**
     * 新增品牌
     * @param brand
     * @return 
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:25
     */
    int insertBrand(Brand brand);
    
    /**
     * 通过品牌名查找分类，用于新增品牌时校验
     * @param brandName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:54
     */
    Brand getBrandByBrandName(String brandName);
    
    /**
     * 查找所有品牌（By 排列顺序）
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:02
     */
    List<Brand> listAllBrand();
    
    /**
     * 修改品牌名（最后加权限）
     * @param brandName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:11
     */
    int updateBrandName(String brandName, Integer brandId);
    
    /**
     * 修改品牌的热度（即展示的顺序）
     * @param brandHot
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:29
     */
    int updateBrandHot(Integer brandHot, Integer brandId);
    
    /**
     * 修改品牌状态
     * @param state
     * @param brandId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:48
     */
    int updateBrandState(Integer state, Integer brandId);
    
    /**
     * 修改品牌排列顺序
     * @param brandSortOrder
     * @param brandId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:51
     */
    int updateBrandSortOrder(Integer brandSortOrder, Integer brandId);

}