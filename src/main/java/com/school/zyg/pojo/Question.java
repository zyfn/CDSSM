package com.school.zyg.pojo;

public class Question {
    private int question_id;
    private String question_des;
    private int theme_id;
    private int yes;
    private int no;
    private int justsoso;

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_des() {
        return question_des;
    }

    public void setQuestion_des(String question_des) {
        this.question_des = question_des;
    }

    public int getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public int getYes() {
        return yes;
    }

    public void setYes(int yes) {
        this.yes = yes;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getJustsoso() {
        return justsoso;
    }

    public void setJustsoso(int justsoso) {
        this.justsoso = justsoso;
    }
}
