package com.casestudy.rest.repository;




import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.rest.db.model.Product;




@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	
	
	Product findByProductId(String productId);

	@SuppressWarnings("unchecked")
	Product save (Product product);

}
