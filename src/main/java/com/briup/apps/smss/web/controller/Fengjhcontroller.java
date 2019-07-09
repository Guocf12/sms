package com.briup.apps.smss.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class Fengjhcontroller {
	@GetMapping("findAll")
	public String findAll() {
		return "hello springboot";

}
}
