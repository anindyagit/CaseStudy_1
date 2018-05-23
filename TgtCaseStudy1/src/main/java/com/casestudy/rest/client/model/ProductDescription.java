package com.casestudy.rest.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDescription {

	String title;
	
	String general_description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGeneral_description() {
		return general_description;
	}

	public void setGeneral_description(String general_description) {
		this.general_description = general_description;
	}
	
	
}
