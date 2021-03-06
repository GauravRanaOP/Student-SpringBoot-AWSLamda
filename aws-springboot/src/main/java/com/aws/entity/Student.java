package com.aws.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private int id;
	
	private String fname;
	
	private String lname;
	
	private int age;
	
	private long number;
}
