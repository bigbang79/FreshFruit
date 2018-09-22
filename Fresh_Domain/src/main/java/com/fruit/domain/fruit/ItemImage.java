package com.fruit.domain.fruit;

import java.io.Serializable;

public class ItemImage implements Serializable {
    
    private static final long serialVersionUID = 4939035996516678836L;

    private Integer itemImageId;

    private Integer itemId;

    private String itemImageCover;

    private String itemImageShow1;

    private String itemImageShow2;

    private String itemImageShow3;

    private String itemImageShow4;

    private String itemImageShow5;

    private String itemImageShow6;

    private Integer state;

    public Integer getItemImageId() {
        return itemImageId;
    }

    public void setItemImageId(Integer itemImageId) {
        this.itemImageId = itemImageId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemImageCover() {
        return itemImageCover;
    }

    public void setItemImageCover(String itemImageCover) {
        this.itemImageCover = itemImageCover == null ? null : itemImageCover.trim();
    }

    public String getItemImageShow1() {
        return itemImageShow1;
    }

    public void setItemImageShow1(String itemImageShow1) {
        this.itemImageShow1 = itemImageShow1 == null ? null : itemImageShow1.trim();
    }

    public String getItemImageShow2() {
        return itemImageShow2;
    }

    public void setItemImageShow2(String itemImageShow2) {
        this.itemImageShow2 = itemImageShow2 == null ? null : itemImageShow2.trim();
    }

    public String getItemImageShow3() {
        return itemImageShow3;
    }

    public void setItemImageShow3(String itemImageShow3) {
        this.itemImageShow3 = itemImageShow3 == null ? null : itemImageShow3.trim();
    }

    public String getItemImageShow4() {
        return itemImageShow4;
    }

    public void setItemImageShow4(String itemImageShow4) {
        this.itemImageShow4 = itemImageShow4 == null ? null : itemImageShow4.trim();
    }

    public String getItemImageShow5() {
        return itemImageShow5;
    }

    public void setItemImageShow5(String itemImageShow5) {
        this.itemImageShow5 = itemImageShow5 == null ? null : itemImageShow5.trim();
    }

    public String getItemImageShow6() {
        return itemImageShow6;
    }

    public void setItemImageShow6(String itemImageShow6) {
        this.itemImageShow6 = itemImageShow6 == null ? null : itemImageShow6.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}