package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {

	
	private final ProductRepository productRepository;
	
	@GetMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("products", productRepository.findAll());
		return "index";
	}
	
	
	@GetMapping("/products")
	public String getAll(Model model) {
		
		model.addAttribute("products", productRepository.findAll());
		return "products";
	}
}
