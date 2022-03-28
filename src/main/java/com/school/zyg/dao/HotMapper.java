package com.school.zyg.dao;

import com.school.zyg.pojo.Hot;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface HotMapper {

    ArrayList<Hot> selectAll();
    void update();
    void delete();
    Hot selectById(String id);
    ArrayList<Hot> selectByTitle( String title);
}
