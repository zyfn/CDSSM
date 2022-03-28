package com.school.zyg.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Government {
    private int government_id;
    private String government_type;
    private String government_name;
    private String government_info;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date government_create_time;
    private String government_announcer;
    private String government_difference;
    private String government_township_name;

    public int getGovernment_id() {
        return government_id;
    }

    public void setGovernment_id(int government_id) {
        this.government_id = government_id;
    }

    public String getGovernment_type() {
        return government_type;
    }

    public void setGovernment_type(String government_type) {
        this.government_type = government_type;
    }

    public String getGovernment_name() {
        return government_name;
    }

    public void setGovernment_name(String government_name) {
        this.government_name = government_name;
    }

    public String getGovernment_info() {
        return government_info;
    }

    public void setGovernment_info(String government_info) {
        this.government_info = government_info;
    }

    public Date getGovernment_create_time() {
        return government_create_time;
    }

    public void setGovernment_create_time(Date government_create_time) {
        this.government_create_time = government_create_time;
    }

    public String getGovernment_announcer() {
        return government_announcer;
    }

    public void setGovernment_announcer(String government_announcer) {
        this.government_announcer = government_announcer;
    }

    public String getGovernment_difference() {
        return government_difference;
    }

    public void setGovernment_difference(String government_difference) {
        this.government_difference = government_difference;
    }

    public String getGovernment_township_name() {
        return government_township_name;
    }

    public void setGovernment_township_name(String government_township_name) {
        this.government_township_name = government_township_name;
    }
}
