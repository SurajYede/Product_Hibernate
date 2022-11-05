package com.example.boot.model;

public class Product {

	private int productId;
	private String productName;
	private int  productQty;
	private String productType;
	private double productPrice;
	
	public Product() {
		
	}

	public Product(int productId, String productName, int productQty, String productType, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.productType = productType;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productType=" + productType + ", productPrice=" + productPrice + "]";
	}
	
	
	
}
