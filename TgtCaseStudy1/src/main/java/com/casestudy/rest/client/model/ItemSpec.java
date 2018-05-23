package com.casestudy.rest.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemSpec {
	@JsonProperty
	private String tcin;
	
	@JsonProperty
	private ProductDescription product_description;

	public String getTcin() {
		return tcin;
	}

	public void setTcin(String tcin) {
		this.tcin = tcin;
	}

	public ProductDescription getProduct_description() {
		return product_description;
	}

	public void setProduct_description(ProductDescription product_description) {
		this.product_description = product_description;
	}
	
	

}
