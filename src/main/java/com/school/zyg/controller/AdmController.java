package com.school.zyg.controller;

import com.school.zyg.service.AdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
public class AdmController {
    @Autowired
    AdmService admService;
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public Map<String,Object> login(String username,String password){
        System.out.println(username);
        return admService.login(username,password);
    }
}
