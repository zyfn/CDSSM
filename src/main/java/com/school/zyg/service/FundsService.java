package com.school.zyg.service;

import com.school.zyg.dao.FundsMapper;
import com.school.zyg.pojo.Funds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundsService {
    @Autowired
    FundsMapper fundsMapper;
    public List<Funds> fundsSearchAll() {
        System.out.println();
        return fundsMapper.selectAll();
    }
    public  List<Funds>  fundsSearchByType(String type) {
        System.out.println(type);
        return fundsMapper.selectByType(type);
    }

    public void fundsUpdate( Funds funds) {
        System.out.println(funds);
        fundsMapper.updateByPrimaryKey(funds);
    }

    public void fundsAdd(Funds funds) {
        System.out.println(funds);
        fundsMapper.insert(funds);
    }
    public void fundsRemove(int id) {
        System.out.println(id);
        fundsMapper.deleteByPrimaryKey(id);
    }
}
