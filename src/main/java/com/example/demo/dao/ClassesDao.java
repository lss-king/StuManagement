package com.example.demo.dao;

import com.example.demo.bean.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassesDao {
    /*查询*/
    @Select("select * from classes")
    //@ResultMap(value = {"StudentMap"})
    public  List<Classes> findById();
}
