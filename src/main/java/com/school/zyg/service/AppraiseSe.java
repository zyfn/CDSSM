package com.school.zyg.service;

import com.school.zyg.dao.Appraise;
import com.school.zyg.pojo.Question;
import com.school.zyg.pojo.Theme;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Service
public class AppraiseSe {

    @Resource
    private Appraise appraise;

    public AppraiseSe() {
    }

    public int take(Theme theme){
        appraise.take(theme);
        return theme.getTheme_id();
    }
    public void ques(ArrayList<Question> al){
        appraise.ques(al);
    }
    public ArrayList<Theme> selectTake(){
        return appraise.selectTake();
    }
    public ArrayList<Question> selectQuestion(int id){
        return appraise.selectQuestion(id);
    }
    public void deleteTake(int id){
        appraise.deleteTake(id);
    }
    public void deleteQuestion(int id){
        appraise.deleteQuestion(id);
    }
    public Theme selectThemeById(int id){
        return appraise.selectThemeById(id);
    }
    public Question selectQuestionById(int id){
        return appraise.selectQuestionById(id);
    }
    public void updateTheme(Theme theme){
        appraise.updateTheme(theme);
    }
    public void updateQuestion(Question question){
        appraise.updateQuestion(question);
    }
    public void getResult(int num,HttpServletRequest request){
        int resultFlag[]=new int[num];
        int idFlag[]=new int[num];
        for(int flag=0;flag<num;flag++){
            resultFlag[flag]=Integer.parseInt(request.getParameter("flag"));
            idFlag[flag]=Integer.parseInt(request.getParameter("flag"));
        }
        for(int flag=0;flag<num;flag++) {
            if(resultFlag[flag]==-1){
                addResult("no",idFlag[flag]);
            }else if(resultFlag[flag]==0){
                addResult("justsoso",idFlag[flag]);
            }else{
                addResult("no",idFlag[flag]);
            }
        }
    }
    public void addResult(String name,int id){
        if("yes".equals(name)){
            addYes(id);
        } else if ("no".equals(name)) {
            addNo(id);
        }else{
            addJustSoSo(id);
        }
    }
    public void addYes(int id){
        appraise.addYes(id);
    }
    public void addNo(int id){
        appraise.addNo(id);
    }
    public void addJustSoSo(int id){
        appraise.addJustSoSo(id);
    }
}
