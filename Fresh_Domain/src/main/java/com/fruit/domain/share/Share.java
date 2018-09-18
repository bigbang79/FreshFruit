package com.fruit.domain.share;

public class Share {
    private Integer id;

    private String shareTitle;

    private Integer shareId;

    private Integer shareUid;

    private Integer shareFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle == null ? null : shareTitle.trim();
    }

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public Integer getShareUid() {
        return shareUid;
    }

    public void setShareUid(Integer shareUid) {
        this.shareUid = shareUid;
    }

    public Integer getShareFlag() {
        return shareFlag;
    }

    public void setShareFlag(Integer shareFlag) {
        this.shareFlag = shareFlag;
    }
}