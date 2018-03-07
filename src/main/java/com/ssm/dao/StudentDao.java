package com.ssm.dao;

import com.ssm.model.Student;

import java.util.List;

public interface StudentDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAllStudent();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
