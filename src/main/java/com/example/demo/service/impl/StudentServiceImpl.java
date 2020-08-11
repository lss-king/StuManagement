package com.example.demo.service.impl;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao sd;

    @Override
    public List<Student> queryAll() {
        //List<Student> list=sd.queryAll();
        //System.out.println(list);
        return sd.queryAll();
    }

}
