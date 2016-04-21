package com.cw.abcba.myp.control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cw.abcba.myp.entity.DB;
import com.cw.abcba.myp.entity.Student;

@RestController
@EnableAutoConfiguration
public class TestControl {
	
	@RequestMapping("/test1")
	@ResponseBody
	public void test1(){
		Student t1 = new Student("nxz",3);
		Student t2 = new Student("bgt",8);
		Student t3 = new Student("mks",1);
		Student t4 = new Student("etr",3);
		Student t5 = new Student("gaa",5);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		System.out.println("排序前");
		for(Student t:list){
			System.out.println(t.toString());
		}
		
		Collections.sort(list, new Comparator<Student>(){

			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
			
		});
		
		System.out.println("排序后");
		for(Student t:list){
			System.out.println(t.toString());
		}
		
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public void test2(){
		String sql = "select name,age from student";
		ResultSet rs = null;
		String name = null;
		int age = 0;
		DB db = new DB(sql);
		try {
			rs = db.sm.executeQuery(sql);
			while(rs.next()){
				name = rs.getString(1);
				age = rs.getInt(2);
				System.out.println("name="+name+",age="+age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestControl.class, args);
	}

}
