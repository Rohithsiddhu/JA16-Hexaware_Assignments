package com.hexarware.restapi.service;

import java.util.List;

import com.hexarware.restapi.dto.ProductDTO;
import com.hexarware.restapi.entity.Product;

public interface IProductService
{
	public Product addProduct(ProductDTO productDTO);
	
	public ProductDTO getById(int pid);
	
	public List<Product> getAllProducts();

}
