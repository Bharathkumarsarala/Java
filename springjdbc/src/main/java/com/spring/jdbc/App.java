package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		/*
		 * System.out.println("in spring jdbc..."); //spring jdbc=> jbdc template
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/spring/jdbc/config.xml"); JdbcTemplate
		 * template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * // insert query String
		 * query="insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //execute query int result= template.update(query,34,"abc","che");
		 * System.out.println("record inserted:" + result);
		 */

		System.out.println("in spring jdbc...");
		// spring jdbc=> jbdc
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		StudentDaoImpl studentDao = context.getBean("studentDao", StudentDaoImpl.class);
		
		//inserting
		Student student = new Student();
		student.setId(354);
		student.setName("xy");
		student.setCity("mirpur");

		int result = studentDao.insert(student);
		
		System.out.println("student added" + result);
		
		
		//updating
//		Student student = new Student();
//		student.setId(2);
//		student.setName("sbk");
//		student.setCity("che");
//		
//		int result = studentDao.change(student);
//		
//		System.out.println("student added" + result);
		
		//delete
//     	int result = studentDao.delete(666);
// 		System.out.println("deleted"+result);
		
		//row map
//		Student student = studentDao.getStudent(34);
//		System.out.println(student);
	
		
		//multiple row mapping
		List<Student> students = studentDao.getAllStudents();
		for(Student s:students) {
			System.out.println(s);
		}
	}

}
