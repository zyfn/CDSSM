package com.school.zyg.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Village {
    private int village_id;
    private String village_type;
    private String village_name;
    private String villag_info;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date village_creaate_time;
    private String village_announcer;
    private String village_difference;
    private String village_township_name;

    public int getVillage_id() {
        return village_id;
    }

    public void setVillage_id(int village_id) {
        this.village_id = village_id;
    }

    public String getVillage_type() {
        return village_type;
    }

    public void setVillage_type(String village_type) {
        this.village_type = village_type;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public String getVillag_info() {
        return villag_info;
    }

    public void setVillag_info(String villag_info) {
        this.villag_info = villag_info;
    }

    public Date getVillage_creaate_time() {
        return village_creaate_time;
    }

    public void setVillage_creaate_time(Date village_creaate_time) {
        this.village_creaate_time = village_creaate_time;
    }

    public String getVillage_announcer() {
        return village_announcer;
    }

    public void setVillage_announcer(String village_announcer) {
        this.village_announcer = village_announcer;
    }

    public String getVillage_difference() {
        return village_difference;
    }

    public void setVillage_difference(String village_difference) {
        this.village_difference = village_difference;
    }

    public String getVillage_township_name() {
        return village_township_name;
    }

    public void setVillage_township_name(String village_township_name) {
        this.village_township_name = village_township_name;
    }
}
