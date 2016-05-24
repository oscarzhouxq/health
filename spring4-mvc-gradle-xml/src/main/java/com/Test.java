package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.impl.StudentDaoImpl;
import com.dao.impl.TeacherDaoImpl;


public class Test {

  
   
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-annotation.xml"); 
		//ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml"); 
		StudentDaoImpl  studentDao =  (StudentDaoImpl) context1.getBean("StudentDaoImpl");
		studentDao.selectAll();
		TeacherDaoImpl  teacherDao =  (TeacherDaoImpl) context1.getBean("TeacherDao");
		teacherDao.selectAll();
		
		
	/*	ApplicationContext context = 
		          new AnnotationConfigApplicationContext(Test.class);
		      MessagePrinter printer = context.getBean(MessagePrinter.class);
		     Man m = context.getBean(Man.class);
		     m.test();
		     System.out.println(printer.toString());
	*/
	}     

}
