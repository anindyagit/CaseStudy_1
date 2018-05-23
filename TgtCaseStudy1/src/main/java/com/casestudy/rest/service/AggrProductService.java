package com.casestudy.rest.service;



import com.casestudy.rest.dto.ProductDto;





public interface AggrProductService {
	
	ProductDto findByProductId(String productid);
	
	ProductDto save (ProductDto productDto);
}
