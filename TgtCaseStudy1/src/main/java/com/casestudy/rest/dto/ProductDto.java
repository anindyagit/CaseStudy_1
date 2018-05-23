package com.casestudy.rest.dto;

public class ProductDto {
	
	private String id;
	
	private String name;
	
	public CurrentPrice currentprice;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public CurrentPrice getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(CurrentPrice currentprice) {
		this.currentprice = currentprice;
	}

	public class CurrentPrice {
		
		private double value;
		
		private String currencyCd;

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

		public String getCurrencyCd() {
			return currencyCd;
		}

		public void setCurrencyCd(String currencyCd) {
			this.currencyCd = currencyCd;
		}
		
		
		
	}
	
	
}
