package com.ssm.service.impl;

import com.ssm.dao.StudentDao;
import com.ssm.model.Student;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {

        List<Student> list = studentDao.selectAllStudent();
        if(list!=null&& list.size()>0){
            for (Student student : list) {
                System.out.println("查询得到的学生的姓名："+student.getName()+",学生的年龄："+student.getAge()+"学生地址："+student.getAddress());
            }
        }
        return list;
    }

    @Override
    public Student getStudentById(int id) {
        Student student = studentDao.selectByPrimaryKey(id);
        System.out.println("查询id为"+id+"的学生姓名是："+student.getName()+",住址："+student.getAddress());

        return student;
    }
}
