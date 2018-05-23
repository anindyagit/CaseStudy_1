package com.casestudy.rest.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	@JsonProperty
	private ItemSpec item;

	public ItemSpec getItem() {
		return item;
	}

	public void setItem(ItemSpec item) {
		this.item = item;
	}
	
	

}
