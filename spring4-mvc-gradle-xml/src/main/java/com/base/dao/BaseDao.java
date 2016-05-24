package com.base.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public  class BaseDao {
	
	@Resource
	private SqlSessionFactory sqlSessionFactory;

	public SqlSession getSqlTemplate() {
		return sqlSessionFactory.openSession();
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
   

}