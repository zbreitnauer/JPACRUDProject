package com.skilldistillery.cars.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.cars.data.CarsDAO;
import com.skilldistillery.cars.entities.Cars;

@Controller
public class CarsController {
	@Autowired
	private CarsDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String home(Model model) {
//		model.addAttribute("cars", dao.findById(1));
		return "home";
	}
	@RequestMapping (path="getCars.do")
	public String showCars(int id, Model model) {
		model.addAttribute("cars", dao.findById(id));
		return "show";
	}
	
	@RequestMapping(path = "getAllCars.do" )
	public String showAll(Model model) {
		List<Cars> c = dao.findAll();
		model.addAttribute("cars", c);
		return "showall";
	}
	
	
	@RequestMapping (path="createCarsForm.do", method=RequestMethod.POST)
	public String createCarsForm(Model model, Cars cars) {
		return "addCars";
	}
	@RequestMapping (path="createCars.do", method=RequestMethod.POST)
	public String createCars(Model model, Cars cars) {
		model.addAttribute("cars", dao.addCar(cars));
		return "addConfirmation";
	}
	@RequestMapping (path="updateCarForm.do", method=RequestMethod.POST)
	public String updateCarForm(Model model, @RequestParam int id) {
		Cars cars = dao.findById(id);
		model.addAttribute("cars", cars);
		return "updatecars";
	}
	@RequestMapping (path="updateCars.do", method=RequestMethod.POST)
	public String updateCars(int id, Model model, Cars cars) {
		model.addAttribute("cars", dao.updateCars(id, cars));
		return "updateConfirmation";
	}
	@RequestMapping (path="deleteCars.do")
	public String deleteCars(int id, Model model) {
		model.addAttribute("cars", dao.deleteCars(id));
		return "deleteConfirmation";
	}
//	@RequestMapping(path = {"carsbymodel.do"})
//	public String findByKeyword(Cars model2, Model model) {
//		List<Cars>cars = dao.findByName(model2);
//		model.addAttribute("cars", cars);
//		return "showall"; 
//}
}
