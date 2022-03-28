package com.school.zyg.pojo;

import java.io.Serializable;

public class Resource implements Serializable {
    private Integer resourceId;

    private String resourceName;

    private String resourceType;

    private String resourceLocation;

    private Double resourceArea;

    private static final long serialVersionUID = 1L;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourceLocation() {
        return resourceLocation;
    }

    public void setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation == null ? null : resourceLocation.trim();
    }

    public Double getResourceArea() {
        return resourceArea;
    }

    public void setResourceArea(Double resourceArea) {
        this.resourceArea = resourceArea;
    }
}