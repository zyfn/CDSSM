package com.school.zyg.dao;

import com.school.zyg.pojo.Assets;
//import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface AssetsMapper {
    int deleteByPrimaryKey(Integer assetsId);

    int insert(Assets record);

    Assets selectByPrimaryKey(Integer assetsId);

    List<Assets>  selectByName(String assetsName);

    List<Assets> selectAll();

    int updateByPrimaryKey(Assets record);
}