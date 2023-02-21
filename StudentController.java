package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Value("${value.name}")
	private String newnameString;
	@GetMapping("/")
	public String homepage() {
	    return newnameString+" to student list";

}
      @GetMapping("/List")
      public List<student> getList(){
    	  List<student> detailsList=new ArrayList<>();
    	  detailsList.add(new student(1,"XXXX",23));
    	  detailsList.add(new student(2,"YYYY",3));
    	  detailsList.add(new student(3,"ZZZZ",25));
    	  
    	  return detailsList;
      }
	
}