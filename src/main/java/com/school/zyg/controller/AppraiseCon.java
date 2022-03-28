package com.school.zyg.controller;

import com.school.zyg.pojo.Question;
import com.school.zyg.pojo.Theme;
import com.school.zyg.service.AppraiseSe;
import com.school.zyg.utils.QuestionPto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@CrossOrigin
@RestController
public class AppraiseCon {

    @Resource
    private AppraiseSe as;

    public AppraiseCon() {
    }
    @RequestMapping("/demo")
    public String demo(){
        System.out.println("我成功了！！！！！！！！！！！");
        return "selectTheme";
    }
    @RequestMapping(value = "/take",method = RequestMethod.POST)
    public Integer take(@RequestBody  Theme theme){//添加标题
//        System.out.println("进来了");
        return as.take(theme);
    }
    @RequestMapping(value = "/ques",method = RequestMethod.POST)
    public void ques(@RequestBody QuestionPto questionPto){//添加问题
        ArrayList<Question> al=new ArrayList<Question>();
        int id = questionPto.getTheme_id();
        Question[] questions=questionPto.getQuestions();
//        System.out.println(question);
        for(int flag=0;flag<questions.length;flag++){
            Question question=new Question();
            question.setQuestion_des(questions[flag].getQuestion_des());
            System.out.println(questions[flag].getQuestion_des());
            question.setTheme_id(id);
            al.add(question);
        }
        as.ques(al);
    }
    @RequestMapping("/selectTake")
    public ArrayList<Theme> selectTheme() {//查询标题
        ArrayList<Theme> al = as.selectTake();
        return al;
    }
    @RequestMapping("/selectQuest")
    public ArrayList<Question> selectQuestion(Model model,int id){//查询问题
        ArrayList<Question> al=as.selectQuestion(id);
        return al;
    }
    @RequestMapping("/deleteTake")
    public void deleteTake(int id){//删除标题
        as.deleteTake(id);
    }
    @RequestMapping("/deleteQuest")
    public void deleteQuestion(int id){//删除问题
        as.deleteQuestion(id);
    }
    @RequestMapping("/selectThemeById")
    public Theme selectThemeById(int id){//通过ID查询标题
        Theme theme=as.selectThemeById(id);
        return theme;
    }
    @RequestMapping("/selectQuestionById")
    public Question selectQuestionById(int id){//通过ID查询问题
        Question question=as.selectQuestionById(id);
        return question;
    }
    @RequestMapping("/updateTheme")
    public void updateTheme(Theme theme){//修改标题
        as.updateTheme(theme);
    }
    @RequestMapping("/updateQuestion")
    public void updateQuestion(Question question){//修改问题
        as.updateQuestion(question);
    }
    @RequestMapping("/getResult")
    public void getResult(int num, HttpServletRequest request){//获取结果集
        as.getResult(num,request);
    }
    @RequestMapping("/addResult")
    public void addResult(String name,int id){//添加结果集
        as.addResult(name,id);
    }
}
