package com.school.zyg.service;

import com.school.zyg.dao.AdmMapper;
import com.school.zyg.pojo.Adm;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdmService {
    @Autowired
    AdmMapper admMapper;

    public Map<String,Object> login(String username, String password) {
        Map<String,Object> loginMap=new HashMap<>();
        System.out.println(username+" "+password);
        Adm adm =admMapper.selectAdm(username,password);
        if(adm!=null){
            loginMap.put("message","登录成功");
            loginMap.put("adm",adm);
        }
        else{
            loginMap.put("message","账号或密码错误");
        }
        return loginMap;
    }
}
