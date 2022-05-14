package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/list")
	public List<String> getProductList() {
	List<String> list = new ArrayList<>();
	list.add("mobile");
	list.add("laptop");
	return list;
	
	
	}
}
