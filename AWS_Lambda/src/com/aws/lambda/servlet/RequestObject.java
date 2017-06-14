package com.aws.lambda.servlet;

public class RequestObject {

	//private static int idIncrement = 0;
	private String id;
	//private String country;
	private String currency;
	private String productCode;
	private int quantity;
	private float productTotal;
	private Address address;
	private int shippingPrice;
	
	public RequestObject() {
		super();
	}
	public RequestObject(String id, String currency, String productCode, int quantity, float productTotal,
			Address address, int shippingPrice) {
		super();
		
		this.id = id;
		this.currency = currency;
		this.productCode = productCode;
		this.quantity = quantity;
		this.productTotal = productTotal;
		this.address = address;
		this.shippingPrice = shippingPrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String string) {
		this.currency = string;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(float productTotal) {
		this.productTotal = productTotal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(int shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	
	@Override
	public String toString() {
		return "RequestObject [id=" + id + ", currency=" + currency + ", productCode=" + productCode + ", quantity="
				+ quantity + ", productTotal=" + productTotal + ", address=" + address.toString() + ", shippingPrice="
				+ shippingPrice + "]";
	}
}
