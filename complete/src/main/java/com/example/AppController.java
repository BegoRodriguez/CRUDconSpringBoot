package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.servicio.ProductService;
import com.example.model.Producto;
import java.util.*;

/** https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-example-with-spring-mvc-spring-data-jpa-thymeleaf-hibernate-mysql */

@Controller
public class AppController {

	@Autowired
    private ProductService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
    	List<Producto> listProducts = service.listAll();
    	model.addAttribute("listProducts", listProducts);
    	return "index";
	}
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
    	Producto product = new Producto();
    	model.addAttribute("product", product);
     
    	return "new_product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Producto product) {
    	service.save(product);
     
    	return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
		public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Producto product = service.get(id);
		mav.addObject("product", product);
     
    	return mav;
	}

	@RequestMapping("/delete/{id}")
		public String deleteProduct(@PathVariable(name = "id") int id) {
    	service.delete(id);
    	return "redirect:/";       
	}

}
