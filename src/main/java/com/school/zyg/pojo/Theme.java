package com.school.zyg.pojo;

import java.util.Date;

public class Theme {
    private int theme_id;
    private String theme_title;
    private Date theme_create_time;

    public int getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public String getTheme_title() {
        return theme_title;
    }

    public void setTheme_title(String theme_title) {
        this.theme_title = theme_title;
    }

    public Date getTheme_create_time() {
        return theme_create_time;
    }

    public void setTheme_create_time(Date theme_create_time) {
        this.theme_create_time = theme_create_time;
    }
}
