package com.aws;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aws.entity.Student;
import com.aws.entity.repository.StudentRepository;

@SpringBootApplication
public class AwsSpringbootApplication {
	
	 @Autowired
	    private StudentRepository st;

	    @Bean
	    public Supplier<List<Student>> students() {
	        return () -> st.student();
	    }

	    @Bean
	    public Function<String, List<Student>> findStudentByFname() {
	        return (input) -> st.student().stream().filter(student -> student.getFname().equals(input)).collect(Collectors.toList());
	    }

	public static void main(String[] args) {
		SpringApplication.run(AwsSpringbootApplication.class, args);
		System.out.println("running");
	}

}
