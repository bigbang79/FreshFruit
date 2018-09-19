package com.fruit.domain.fruit;

import java.io.Serializable;

public class Brand implements Serializable {

    private static final long serialVersionUID = -3527264807417906830L;

    private Integer brandId;

    private String brandName;

    private Integer brandHot;

    private Integer brandSortOrder;

    private Integer state;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getBrandHot() {
        return brandHot;
    }

    public void setBrandHot(Integer brandHot) {
        this.brandHot = brandHot;
    }

    public Integer getBrandSortOrder() {
        return brandSortOrder;
    }

    public void setBrandSortOrder(Integer brandSortOrder) {
        this.brandSortOrder = brandSortOrder;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}