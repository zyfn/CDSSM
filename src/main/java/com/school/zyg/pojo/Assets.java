package com.school.zyg.pojo;

import java.io.Serializable;

public class Assets implements Serializable {
    private Integer assetsId;

    private String assetsName;

    private String assetsType;

    private String assetsStatus;

    private String assetsNature;

    private static final long serialVersionUID = 1L;

    public Integer getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(Integer assetsId) {
        this.assetsId = assetsId;
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName == null ? null : assetsName.trim();
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType == null ? null : assetsType.trim();
    }

    public String getAssetsStatus() {
        return assetsStatus;
    }

    public void setAssetsStatus(String assetsStatus) {
        this.assetsStatus = assetsStatus == null ? null : assetsStatus.trim();
    }

    public String getAssetsNature() {
        return assetsNature;
    }

    public void setAssetsNature(String assetsNature) {
        this.assetsNature = assetsNature == null ? null : assetsNature.trim();
    }
}