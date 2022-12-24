package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component("sobj")
public class Student {
	
//	@Value("#{10+20}")  //spEL
	@Value("155")
//	@Value("${rollNo}")
	private int rollNo;
	@Value("")
	private String stdName;
	
}
