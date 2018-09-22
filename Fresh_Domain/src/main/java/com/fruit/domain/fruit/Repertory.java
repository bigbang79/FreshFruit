package com.fruit.domain.fruit;

import java.io.Serializable;

public class Repertory implements Serializable {

    private static final long serialVersionUID = 4970725155941513105L;

    private Integer repertoryId;

    private Integer itemId;

    private Integer itemTotalNum;

    private Integer itemSurplusNum;

    private Integer state;

    public Integer getRepertoryId() {
        return repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemTotalNum() {
        return itemTotalNum;
    }

    public void setItemTotalNum(Integer itemTotalNum) {
        this.itemTotalNum = itemTotalNum;
    }

    public Integer getItemSurplusNum() {
        return itemSurplusNum;
    }

    public void setItemSurplusNum(Integer itemSurplusNum) {
        this.itemSurplusNum = itemSurplusNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}