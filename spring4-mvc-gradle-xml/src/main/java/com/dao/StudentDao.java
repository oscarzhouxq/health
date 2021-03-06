package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

    public int insert(Student user);
     
    public int update(Student user);
   
    public int delete(String userName);
   
    public List selectAll();
   

}