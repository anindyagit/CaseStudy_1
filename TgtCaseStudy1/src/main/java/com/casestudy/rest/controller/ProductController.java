package com.casestudy.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.casestudy.rest.dto.ProductDto;

import com.casestudy.rest.service.AggrProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	private final static Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private AggrProductService productService;
	
	
	  
	  @RequestMapping(value="/{id}", method = RequestMethod.GET)
	  public ResponseEntity<ProductDto> getProductById(@PathVariable ("id") String id){
		  
		logger.debug("Start executing getProductBy id for :"+id); 
		
		ProductDto productDto= productService.findByProductId(id)  ;
		
		logger.debug("ProductDto received :"+productDto); 
		
		if (productDto==null ) {
			return new ResponseEntity<ProductDto>(productDto,HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<ProductDto> (productDto,HttpStatus.OK);
	  }
	  
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<ProductDto> updateProductPrice(@PathVariable("id") String id, @RequestBody ProductDto productDto) {
	        
		  logger.debug("Start executing update product price id for :"+id);      
	        ProductDto modifiedProduct=productService.save(productDto);
	        
	        logger.debug("Modified ProductDto received :"+modifiedProduct); 
	        
	        if (modifiedProduct==null) {
	           
	            return new ResponseEntity<ProductDto>(modifiedProduct,HttpStatus.BAD_REQUEST);
	        }    
	        return new ResponseEntity<ProductDto> (modifiedProduct,HttpStatus.OK);
	    }

}
