package com.fruit.domain.fruit;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
    
    private static final long serialVersionUID = -8285010139129284120L;

    private Integer itemId;

    private Integer categoryId;

    private Integer brandId;

    private Integer placeId;

    private String itemName;

    private String itemSellPoint;

    private Integer itemPriceShow;

    private Integer itemPriceReal;

    private Integer isHot;

    private Integer itemHot;

    private Integer isHave;

    private Integer itemRepertory;

    private String itemBarcode;

    private String itemQrcode;

    private Integer itemImageId;

    private Integer itemInfoId;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemSellPoint() {
        return itemSellPoint;
    }

    public void setItemSellPoint(String itemSellPoint) {
        this.itemSellPoint = itemSellPoint == null ? null : itemSellPoint.trim();
    }

    public Integer getItemPriceShow() {
        return itemPriceShow;
    }

    public void setItemPriceShow(Integer itemPriceShow) {
        this.itemPriceShow = itemPriceShow;
    }

    public Integer getItemPriceReal() {
        return itemPriceReal;
    }

    public void setItemPriceReal(Integer itemPriceReal) {
        this.itemPriceReal = itemPriceReal;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getItemHot() {
        return itemHot;
    }

    public void setItemHot(Integer itemHot) {
        this.itemHot = itemHot;
    }

    public Integer getIsHave() {
        return isHave;
    }

    public void setIsHave(Integer isHave) {
        this.isHave = isHave;
    }

    public Integer getItemRepertory() {
        return itemRepertory;
    }

    public void setItemRepertory(Integer itemRepertory) {
        this.itemRepertory = itemRepertory;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode == null ? null : itemBarcode.trim();
    }

    public String getItemQrcode() {
        return itemQrcode;
    }

    public void setItemQrcode(String itemQrcode) {
        this.itemQrcode = itemQrcode == null ? null : itemQrcode.trim();
    }

    public Integer getItemImageId() {
        return itemImageId;
    }

    public void setItemImageId(Integer itemImageId) {
        this.itemImageId = itemImageId;
    }

    public Integer getItemInfoId() {
        return itemInfoId;
    }

    public void setItemInfoId(Integer itemInfoId) {
        this.itemInfoId = itemInfoId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}