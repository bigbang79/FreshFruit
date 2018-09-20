package com.fruit.controller.web;

import java.util.List;

import com.fruit.domain.fruit.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.common.vo.R;

import com.fruit.service.BrandService;

@Controller
public class BrandController {
    
    @Autowired
    private BrandService brandService;

    /**
     * 新增品牌
     * @param brand 
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:31
     */
    @RequestMapping("insertBrand.do")
    @ResponseBody
    public R<Brand> insertBrand(Brand brand) {
        R<Brand> result = new R<Brand>();
        // 判断brand属性不为空
        if (null == brand.getBrandName() || "".equals(brand.getBrandName())) {
            result.setCode(0);
            result.setMsg("新增品牌失败");
            return result;
        }
        // 新增成功返回true，失败返回false
        boolean flag = brandService.insertBrand(brand);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "新增品牌成功" : "新增品牌失败");
        return result;
    }
    
    /**
     * 通过品牌名查找分类，用于新增品牌时校验
     * @param brandName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 20:57
     */
    @RequestMapping("getBrandByBrandName.do")
    @ResponseBody
    public R<Brand> getBrandByBrandName(String brandName) {
        R<Brand> result = new R<Brand>();
        // 查到返回brand，否则返回null
        Brand brand = brandService.getBrandByBrandName(brandName);
        result.setCode(null != brand ? 1 : 0);
        result.setMsg(null != brand  ? "该品牌已存在" : "该品牌可添加");
        return result;
    }
    
    /**
     * 查找所有品牌
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:06
     */
    @RequestMapping("listAllBrand.do")
    @ResponseBody
    public R<Brand> listAllBrand() {
        R<Brand> result = new R<Brand>();
        // 查到返回包含所有品牌的list，否则返回null
        List<Brand> list = brandService.listAllBrand();
        result.setCode(null != list ? 1 : 0);
        result.setMsg(null != list  ? "查找所有品牌成功" : "查找所有品牌失败");
        result.setData(list);
        return result;
    }
    
    /**
     * 修改品牌名
     * @param brandName
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:13
     */
    @RequestMapping("updateBrandName.do")
    @ResponseBody
    public R<Brand> updateBrandName(String brandName, Integer brandId) {
        R<Brand> result = new R<Brand>();
        // 查到返回包含所有品牌的list，否则返回null
        boolean flag = brandService.updateBrandName(brandName, brandId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改品牌名成功" : "修改品牌名失败");
        return result;
    }
    
    /**
     * 修改品牌的热度（即展示的顺序）
     * @param brandHot
     * @param brandId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:32
     */
    @RequestMapping("updateBrandHot.do")
    @ResponseBody
    public R<Brand> updateBrandHot(Integer brandHot, Integer brandId) {
        R<Brand> result = new R<Brand>();
        // 修改成功返回true，失败返回false
        boolean flag = brandService.updateBrandHot(brandHot, brandId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改品牌热度成功" : "修改品牌热度失败");
        return result;
    }
    
    /**
     * 修改品牌状态
     * @param state
     * @param brandId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:49
     */
    @RequestMapping("updateBrandState.do")
    @ResponseBody
    public R<Brand> updateBrandState(Integer state, Integer brandId) {
        R<Brand> result = new R<Brand>();
        // 修改成功返回true，失败返回false
        boolean flag = brandService.updateBrandState(state, brandId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改品牌状态成功" : "修改品牌状态失败");
        return result;
    }
    
    /**
     * 修改品牌排列顺序
     * @param brandSortOrder
     * @param brandId
     * @return
     * @Author ZhuWenFeng
     * @Date 2018-09-18 21:52
     */
    @RequestMapping("updateBrandSortOrder.do")
    @ResponseBody
    public R<Brand> updateBrandSortOrder(Integer brandSortOrder, Integer brandId) {
        R<Brand> result = new R<Brand>();
        // 修改成功返回true，失败返回false
        boolean flag = brandService.updateBrandSortOrder(brandSortOrder, brandId);
        result.setCode(flag ? 1 : 0);
        result.setMsg(flag ? "修改品牌排列顺序成功" : "修改品牌排列顺序失败");
        return result;
    }
    
}
