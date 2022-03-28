package com.school.zyg.dao;

import com.school.zyg.pojo.Adm;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdmMapper {
    int deleteByPrimaryKey(Integer admId);

    int insert(Adm record);

    Adm selectByPrimaryKey(Integer admId);

    List<Adm> selectAll();

    Adm selectAdm(@Param("username") String username,@Param("password") String password );

    int updateByPrimaryKey(Adm record);
}