package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.CarDAO;
import com.pojo.Car;

@Controller
public class HomeController {
	CarDAO dao = new CarDAO();

	@RequestMapping("/home")
	public String setHome(Model model) {
		ArrayList<Car> list = new ArrayList<Car>();
		list=dao.showCar();
		model.addAttribute("list", list);
		return "List";
	}

	@RequestMapping("/add")
	public String setAddShow() {

		return "CarDetails";
	}

	@RequestMapping("/delete")
	public String setDelete(@RequestParam("cNumber") String cNumber) {
			dao.deleteCar(cNumber);
		return "redirectToList";
	}

	@RequestMapping("/saveCar")
	public String setAdd(@RequestParam("cname") String name, @RequestParam("cnum") String cnumber,
			@RequestParam("cowner") String cowner, Model model) {
		Car c = new Car(name, cnumber, cowner);
		int re = dao.setCar(c);
		System.out.println(re);
		return "redirectToList";
	}
}
