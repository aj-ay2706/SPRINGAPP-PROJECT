package com.example.demo;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class StudentController {
	@GetMapping("/get")
	public StudentResponse getStudent()
	{
		StudentResponse studentResponse=new StudentResponse(1,"John","Smith");
		return studentResponse;
	}

}
