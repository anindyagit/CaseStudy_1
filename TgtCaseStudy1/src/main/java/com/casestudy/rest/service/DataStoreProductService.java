package com.casestudy.rest.service;

import com.casestudy.rest.db.model.Product;

public interface DataStoreProductService {
	
	Product getProductById(String productId);
	
	Product save(Product product);
}
