package com.project.controller;

import org.springframework.stereotype.Controller;

import com.project.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {

	
	private final ProductRepository productRepository;
}
