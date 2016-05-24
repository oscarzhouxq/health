package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;



import com.base.dao.BaseDao;
import com.model.Student;

@Component(value="TeacherDao")
public  class TeacherDaoImpl extends BaseDao{

	public int insert(Student user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Student user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List selectAll() {
		System.out.println("teacher dao .......");
		List<String> s = this.getSqlTemplate().selectList("selectTeacher");
		for(String s1:s){
			System.out.println(s1);
		}
		return null;
	}

}
