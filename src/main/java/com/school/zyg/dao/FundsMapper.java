package com.school.zyg.dao;

import com.school.zyg.pojo.Funds;
//import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Mapper
@Repository
public interface FundsMapper {
    int deleteByPrimaryKey(Integer fundsId);

    int insert(Funds record);

    Funds selectByPrimaryKey(Integer fundsId);

    List<Funds>  selectByType(String fundsType);

    List<Funds> selectAll();

    int updateByPrimaryKey(Funds record);
}