package com.casestudy.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.rest.client.RestClientProduct;
import com.casestudy.rest.service.RestClientProductService;

@Service
public class RestClientProductserviceImpl implements RestClientProductService {
	
	@Autowired
	RestClientProduct restClientProduct;

	@Override
	public String getProductNameById(final String productId) {
		
		return restClientProduct.getProductById(productId);
	}

}
