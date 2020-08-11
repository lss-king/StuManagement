package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api( description= "学员信息操作类")
@RestController
public class StudentController {
    @Autowired
    StudentService ss;


    @ApiOperation( value= "学员信息查询")
    @GetMapping("index")
    public String query() {

        return JSONObject.toJSON(ss.queryAll()).toString();
    }
}
