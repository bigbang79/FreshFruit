package com.fruit.domain.fruit;

import java.io.Serializable;

public class ItemInfo implements Serializable {

    private static final long serialVersionUID = -3123827840612108474L;

    private Integer itemInfoId;

    private Integer itemId;

    private String itemSpecification;

    private String itemDesc;

    private String itemDescImage;

    private String itemParameter;

    private String itemPack;

    private String itemAfterSale;

    private Integer state;

    public Integer getItemInfoId() {
        return itemInfoId;
    }

    public void setItemInfoId(Integer itemInfoId) {
        this.itemInfoId = itemInfoId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemSpecification() {
        return itemSpecification;
    }

    public void setItemSpecification(String itemSpecification) {
        this.itemSpecification = itemSpecification == null ? null : itemSpecification.trim();
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    public String getItemDescImage() {
        return itemDescImage;
    }

    public void setItemDescImage(String itemDescImage) {
        this.itemDescImage = itemDescImage == null ? null : itemDescImage.trim();
    }

    public String getItemParameter() {
        return itemParameter;
    }

    public void setItemParameter(String itemParameter) {
        this.itemParameter = itemParameter == null ? null : itemParameter.trim();
    }

    public String getItemPack() {
        return itemPack;
    }

    public void setItemPack(String itemPack) {
        this.itemPack = itemPack == null ? null : itemPack.trim();
    }

    public String getItemAfterSale() {
        return itemAfterSale;
    }

    public void setItemAfterSale(String itemAfterSale) {
        this.itemAfterSale = itemAfterSale == null ? null : itemAfterSale.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}