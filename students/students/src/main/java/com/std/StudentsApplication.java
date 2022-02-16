package com.std;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String str = "select *from student";
		List<Student> students = jdbcTemplate.query(str, BeanPropertyRowMapper.newInstance(Student.class));
		
		students.forEach(System.out :: println);
	}

}
