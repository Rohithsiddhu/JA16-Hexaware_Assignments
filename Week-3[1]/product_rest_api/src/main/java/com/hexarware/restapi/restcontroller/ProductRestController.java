package com.hexarware.restapi.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexarware.restapi.dto.ProductDTO;
import com.hexarware.restapi.entity.Product;
import com.hexarware.restapi.exception.ProdcutNotFoundException;
import com.hexarware.restapi.service.IProductService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/products")
public class ProductRestController 
{
	
	Logger logger=LoggerFactory.getLogger(ProductRestController.class);
	@Autowired
	IProductService service;
	
	@PostMapping("/add")
	public Product addProduct(@Valid @RequestBody ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return service.addProduct(productDTO);
	}

	@GetMapping("get/{pid}")
	public ProductDTO getById(@Valid @Min(1) @PathVariable int pid) throws ProdcutNotFoundException {
		
		
		
	
		ProductDTO productDTO=service.getById(pid) ;
		if(productDTO.getPid()==0)
		{
			throw new ProdcutNotFoundException(HttpStatus.BAD_REQUEST,"prodcut not found for pid");
		}
		return productDTO;
	}

	@GetMapping("/getall")
	public List<Product> getAllProducts() {
		
		
		logger.info("i am info");
		logger.warn("i am warning");
		logger.debug("i am debud");
		logger.error("i am error");
		logger.info(" i am from service");
		
		return service.getAllProducts();
	}
	
	@GetMapping("/div/{a}/{b}")
	public int div(@PathVariable int a,@PathVariable int b)
	{
		return a/b;
	}
	/*
	 * @ResponseStatus(value=HttpStatus.FORBIDDEN,reason="sorry you cant divide")
	 * 
	 * @ExceptionHandler({ArithmeticException.class}) public void handleException()
	 * {
	 * 
	 * }
	 */
	
	/*
	 * @ExceptionHandler({ProdcutNotFoundException.class}) public
	 * ResponseEntity<String> handleProductNotFoundExp(ProdcutNotFoundException pe)
	 * { return new ResponseEntity<String>(pe.getMessage(),HttpStatus.BAD_REQUEST);
	 * }
	 */
	
}
