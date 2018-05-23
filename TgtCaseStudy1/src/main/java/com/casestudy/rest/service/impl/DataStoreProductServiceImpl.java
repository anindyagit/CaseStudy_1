package com.casestudy.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.rest.db.model.Product;
import com.casestudy.rest.repository.ProductRepository;
import com.casestudy.rest.service.DataStoreProductService;

@Service
public class DataStoreProductServiceImpl implements DataStoreProductService {
	
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product getProductById(final String productId) {
		return  productRepository.findByProductId(productId);
	}

	@Override
	public Product save(final Product product) {
		
	 return	productRepository.save(product);
	}

}
