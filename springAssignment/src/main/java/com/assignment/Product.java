package com.assignment;

public class Product 
{
	private int productId;
	private String productName;
	private int productPrice;
	private String productCateory;
	private int productQuantity;
	private int productQuality;
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCateory() {
		return productCateory;
	}
	public void setProductCateory(String productCateory) {
		this.productCateory = productCateory;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Product(int productId, String productName, int productPrice, String productCateory, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCateory = productCateory;
		this.productQuantity = productQuantity;
	}
	public Product() {
		super();
	}
}
