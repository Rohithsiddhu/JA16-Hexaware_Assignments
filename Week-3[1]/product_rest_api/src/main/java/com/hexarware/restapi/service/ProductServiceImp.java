package com.hexarware.restapi.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexarware.restapi.dto.ProductDTO;
import com.hexarware.restapi.entity.Product;
import com.hexarware.restapi.repository.ProductRepository;
@Service
public class ProductServiceImp implements IProductService
{
	Logger logger=LoggerFactory.getLogger(ProductServiceImp.class);
	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(ProductDTO productDTO) {
		Product product=new Product();
		product.setPname(productDTO.getPname());
		product.setPrice(productDTO.getPrice());
		
		return repo.save(product);
	}

	@Override
	public ProductDTO getById(int pid)
	{
		
		
		 Product product=repo.findById(pid).orElse(new Product());
		 ProductDTO productDTO=new ProductDTO();
		 productDTO.setPid(product.getPid());
		 productDTO.setPname(product.getPname());
		 productDTO.setPrice(product.getPrice());	 
		 return productDTO; 
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
