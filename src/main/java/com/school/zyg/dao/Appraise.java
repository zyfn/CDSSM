package com.school.zyg.dao;

import com.school.zyg.pojo.Question;
import com.school.zyg.pojo.Theme;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


@Repository
public interface Appraise {

    public abstract void take(@Param("theme")Theme theme);
    public abstract void ques( ArrayList<Question> list);
    public abstract ArrayList<Theme> selectTake();
    public abstract ArrayList<Question> selectQuestion(int id);
    public abstract void deleteTake(int id);
    public abstract void deleteQuestion(int id);
    public abstract Theme selectThemeById(int id);
    public abstract Question selectQuestionById(int id);
    public abstract void updateTheme(Theme theme);
    public abstract void updateQuestion(Question question);
    public abstract void getResult(int num, HttpServletRequest request);
    public abstract void addResult(String name,int id);
    public abstract void addYes(int id);
    public abstract void addNo(int id);
    public abstract void addJustSoSo(int id);
}
