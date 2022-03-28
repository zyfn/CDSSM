package com.school.zyg.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Party {
    private int party_id;
    private String party_type;
    private String party_name;
    private String party_info;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date party_create_time;
    private String party_announcer;
    private String party_difference;
    private String party_township_name;

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public String getParty_type() {
        return party_type;
    }

    public void setParty_type(String party_type) {
        this.party_type = party_type;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String getParty_info() {
        return party_info;
    }

    public void setParty_info(String party_info) {
        this.party_info = party_info;
    }

    public Date getParty_create_time() {
        return party_create_time;
    }

    public void setParty_create_time(Date party_create_time) {
        this.party_create_time = party_create_time;
    }

    public String getParty_announcer() {
        return party_announcer;
    }

    public void setParty_announcer(String party_announcer) {
        this.party_announcer = party_announcer;
    }

    public String getParty_difference() {
        return party_difference;
    }

    public void setParty_difference(String party_difference) {
        this.party_difference = party_difference;
    }

    public String getParty_township_name() {
        return party_township_name;
    }

    public void setParty_township_name(String party_township_name) {
        this.party_township_name = party_township_name;
    }
}
