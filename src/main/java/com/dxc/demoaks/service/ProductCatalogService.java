package com.dxc.demoaks.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalogService {

	@GetMapping("/products")
	public String sayHello() {
		return "Hello World!";
	}
	
}
