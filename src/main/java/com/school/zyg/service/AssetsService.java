package com.school.zyg.service;

import com.school.zyg.dao.AssetsMapper;
import com.school.zyg.pojo.Assets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsService {
    @Autowired
    private AssetsMapper assetsMapper;

    public List<Assets> assetsSearchAll() {
        return assetsMapper.selectAll();
    }

    public List<Assets>  assetsSearchByName(String name) {
        return assetsMapper.selectByName(name);
    }

    public void assetsUpdate(Assets assets) {
        assetsMapper.updateByPrimaryKey(assets);
    }

    public void assetsAdd(Assets assets) {
        assetsMapper.insert(assets);
        System.out.println("插入成功");
    }

    public void assetsRemove(int id) {
        System.out.println(id);
        assetsMapper.deleteByPrimaryKey(id);
    }

}
