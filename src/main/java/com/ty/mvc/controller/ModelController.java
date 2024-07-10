package com.ty.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelController {

	@GetMapping("/name")
	public String getModelView(ModelMap map) {
		map.put("Name", "Ram");
		map.put("Location", "ayodhya");
		System.out.println(map);

		return "display.jsp";
	}
}
