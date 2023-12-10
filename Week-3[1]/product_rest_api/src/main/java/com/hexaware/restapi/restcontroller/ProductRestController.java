package com.hexaware.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restapi.dto.ProductDTO;
import com.hexaware.restapi.entity.Product;
import com.hexaware.restapi.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	IProductService service;
	
	@PostMapping("/add")
	public Product addProduct(ProductDTO productDTO) {
		
		
		return service.addProduct(productDTO);
	}

	@GetMapping("/get/{pid}")
	public ProductDTO getById(int pid) {
		// TODO Auto-generated method stub
		return service.getById(pid);
	}

	@GetMapping("/getall")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return service.getAllProducts();
	}

}
