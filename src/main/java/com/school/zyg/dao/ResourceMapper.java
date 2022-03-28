package com.school.zyg.dao;

import com.school.zyg.pojo.Resource;
//import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface ResourceMapper {
    int deleteByPrimaryKey(Integer resourceId);

    int insert(Resource record);

    Resource selectByPrimaryKey(Integer resourceId);

    List<Resource> selectByName(String resourceName);

    List<Resource> selectAll();

    int updateByPrimaryKey(Resource record);
}