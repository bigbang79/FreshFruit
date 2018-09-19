package com.fruit.domain.fruit;

import java.io.Serializable;

public class UserItem implements Serializable {

    private static final long serialVersionUID = -8188143084496549585L;

    private Integer userItemId;

    private Integer userId;

    private Integer itemId;

    private Integer userStar;

    private Integer isreply;

    private Integer islike;

    private Integer iscollect;

    private Integer isshare;

    private Integer isbuy;

    private Integer state;

    public Integer getUserItemId() {
        return userItemId;
    }

    public void setUserItemId(Integer userItemId) {
        this.userItemId = userItemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getUserStar() {
        return userStar;
    }

    public void setUserStar(Integer userStar) {
        this.userStar = userStar;
    }

    public Integer getIsreply() {
        return isreply;
    }

    public void setIsreply(Integer isreply) {
        this.isreply = isreply;
    }

    public Integer getIslike() {
        return islike;
    }

    public void setIslike(Integer islike) {
        this.islike = islike;
    }

    public Integer getIscollect() {
        return iscollect;
    }

    public void setIscollect(Integer iscollect) {
        this.iscollect = iscollect;
    }

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
    }

    public Integer getIsbuy() {
        return isbuy;
    }

    public void setIsbuy(Integer isbuy) {
        this.isbuy = isbuy;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}