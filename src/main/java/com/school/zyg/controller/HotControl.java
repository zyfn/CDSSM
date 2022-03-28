package com.school.zyg.controller;

import com.school.zyg.dao.HotMapper;
import com.school.zyg.pojo.Hot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@CrossOrigin
@RestController
@RequestMapping("/hot")
public class HotControl {

    @Autowired(required = false)
    private HotMapper hotMapper;

    @RequestMapping("/getAll")
    @ResponseBody
    public ArrayList<Hot> getAll(){
        ArrayList<Hot> hotList=hotMapper.selectAll();
        return hotList;
    }

    @RequestMapping("getById")
    @ResponseBody
    public Hot getById(String id){
        Hot hot=hotMapper.selectById(id);
        return hot;
    }

    @RequestMapping("getByTitle")
    @ResponseBody
    public ArrayList<Hot> getByTitle(String title){
        ArrayList<Hot> hotList=hotMapper.selectByTitle(title);
        return hotList;
    }
}
