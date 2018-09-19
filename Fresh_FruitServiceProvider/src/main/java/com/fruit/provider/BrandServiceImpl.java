package com.fruit.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.common.util.RandomUtils;
import com.fruit.mapper.fruit.BrandMapper;
import com.fruit.domain.fruit.Brand;
import com.fruit.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
    
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public boolean insertBrand(Brand brand) {
        try {
            // 设置brandId随机值
            brand.setBrandId(RandomUtils.getId());
            return brandMapper.insertBrand(brand) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Brand getBrandByBrandName(String brandName) {
        Brand brand = brandMapper.getBrandByBrandName(brandName);
        return null != brand ? brand : null;
    }

    @Override
    public List<Brand> listAllBrand() {
        List<Brand> list = brandMapper.listAllBrand();
        return list.size() > 0 ? list : null;
    }

    @Override
    public boolean updateBrandName(String brandName, Integer brandId) {
        try {
            return brandMapper.updateBrandName(brandName, brandId) > 0 ? true :false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateBrandHot(Integer brandHot, Integer brandId) {
        try {
            return brandMapper.updateBrandHot(brandHot, brandId) > 0 ? true : false ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateBrandState(Integer state, Integer brandId) {
        try {
            return brandMapper.updateBrandState(state, brandId) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateBrandSortOrder(Integer brandSortOrder, Integer brandId) {
        try {
            return brandMapper.updateBrandSortOrder(brandSortOrder, brandId) > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
