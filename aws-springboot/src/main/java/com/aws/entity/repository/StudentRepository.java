package com.aws.entity.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.aws.entity.Student;

@Repository
public class StudentRepository {

	public List<Student> student(){
		
		return Stream.of(
				new Student(1, "Gaurav", "Rana", 23, 8826884637L),
				new Student(2, "Saurav", "Rana", 18, 8918245567L),
				new Student(3, "Sachin", "Joshi", 25, 9934569933L),
				new Student(4, "Gaurav", "Bisht", 21, 8834764933L)
				).collect(Collectors.toList());
	}
}
