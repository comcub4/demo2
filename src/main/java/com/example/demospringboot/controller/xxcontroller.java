package com.example.demospringboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class xxcontroller {
	@RequestMapping(value ="/index")
	public @ResponseBody Map<String,String> query1(@RequestParam(value="name") String name,
			@RequestParam(value="age")String age) {
		Map<String,String> map=new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		return map;
	}
	
	@RequestMapping(value ="/test")
	public String test() {
		
		return "for test";
	}
}

class User{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	


	

	
}
