package com.skilldistillery.cars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.cars.data.CarsDAO;

@Controller
public class CarsController {
	@Autowired
	private CarsDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String home(Model model) {
		model.addAttribute("DEBUG", dao.findById(2));
		return "home";
	}

}
