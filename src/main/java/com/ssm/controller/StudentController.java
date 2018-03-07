package com.ssm.controller;

import com.ssm.model.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/info")
    @ResponseBody
    public List getAllStudentInfo() {
        List<Student> list = new ArrayList<>();
        list = studentService.getAllStudent();
        return list;
    }

    @RequestMapping("/byId")
    @ResponseBody
    public Integer getAllStudentInfoById(HttpServletRequest request) {
        List<Student> list = new ArrayList<>();
        Student bo = studentService.getStudentById(Integer.valueOf(request
                .getParameter("id")));
        return bo.getAge();
    }
}
