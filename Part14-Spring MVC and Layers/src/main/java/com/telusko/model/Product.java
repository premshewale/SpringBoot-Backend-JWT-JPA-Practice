package com.telusko.model;


import org.springframework.stereotype.Component;


@Component
public class Product {

    public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	private int prodId;
    public Product() {
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String prodName;
    private int price;
}
