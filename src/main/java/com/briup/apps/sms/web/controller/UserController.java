package com.briup.apps.sms.web.controller;


import org.springframewotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//就是你说的
@RequestMapping("/user")
public class UserController {
	
	
	public String findAll() {
		// 1. 从数据库中查询出所有的学生
		// 2. 将所有学生返回
		return "hello springboot";//返回对应输出
	}//创建类
}

