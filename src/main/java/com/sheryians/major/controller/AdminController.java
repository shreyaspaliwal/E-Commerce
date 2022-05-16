package com.sheryians.major.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping("/admin")
	public String addHome() {
		return "adminHome";
	}
	
	@GetMapping("/admin/categories")
	public String getCategory() {
		return "categories";
	}
	
	@GetMapping("/admin/categories/add")
	public String getCategoryAdd() {
		return "categoriesAdd";
	}
}
