package com.school.zyg.pojo;

import java.io.Serializable;

public class Funds implements Serializable {
    private Integer fundsId;

    private String fundsType;

    private String fundsStatus;

    private Double fundsBalance;

    private static final long serialVersionUID = 1L;

    public Integer getFundsId() {
        return fundsId;
    }

    public void setFundsId(Integer fundsId) {
        this.fundsId = fundsId;
    }

    public String getFundsType() {
        return fundsType;
    }

    public void setFundsType(String fundsType) {
        this.fundsType = fundsType == null ? null : fundsType.trim();
    }

    public String getFundsStatus() {
        return fundsStatus;
    }

    public void setFundsStatus(String fundsStatus) {
        this.fundsStatus = fundsStatus == null ? null : fundsStatus.trim();
    }

    public Double getFundsBalance() {
        return fundsBalance;
    }

    public void setFundsBalance(Double fundsBalance) {
        this.fundsBalance = fundsBalance;
    }
}