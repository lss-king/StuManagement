package com.example.demo.dao;

import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;


import java.util.List;

@Mapper
public interface StudentDao {
    /*查询*/
    @Select("SELECT * from student")
    /*@Results(id = "StudentMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "sname", column = "sname"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "telephone", column = "telephone"),
            @Result(property = "email", column = "email"),
            @Result(property = "classId", column = "classId"),
            //配置用户查询的方式 column代表的传入的字段，一对一查询用one select 代表使用的方法的全限定名， fetchType表示查询的方式为立即加载还是懒加载
            @Result(property = "c", column = "id", one = @One(select = "com.example.demo.dao.ClassesDao.findById", fetchType = FetchType.EAGER))
    })*/
    public List<Student> queryAll();
}
