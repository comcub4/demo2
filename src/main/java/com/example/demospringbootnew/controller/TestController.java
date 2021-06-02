package com.example.demospringbootnew.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> testMap() {
		Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public ResponseEntity<String> testString() {
		String string = "testString";
		return new ResponseEntity<>(string, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/requestEntity", method = RequestMethod. GET)
	public ResponseEntity<String> requestEntity(RequestEntity<Map<String, String>> requestEntity) {
	System.out.println(requestEntity.getHeaders());
	System.out.println(requestEntity.getBody());
	return new ResponseEntity<>("success", HttpStatus.OK);
	}
}