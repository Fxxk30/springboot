package com.huang.sbp03.controller;

import com.huang.sbp03.mapper.TeacherMapper;
import com.huang.sbp03.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    TeacherMapper teacherMapper;

    @RequestMapping("/teacherLogin")
    public int Teacherlogin(Teacher teacher){
        String loginpwd = teacherMapper.teacherLogin(teacher);
        /*System.out.println(loginpwd);*/
        if (teacher.getPwd().equals(loginpwd))  {
            /*System.out.println(loginpwd);
            System.out.println(teacher.getPwd());*/
            return 1;
        }else return 0;
    }
}
