package com.aws.lambda.servlet;

public class ResponseObject {

	private String id;
	private float productTotal;
	private float taxTotal;
	private int shippingPrice;
	private float grandTotal;
	public ResponseObject(String id, int shippingPrice, float productTotal, String state) {
		super();
		this.id = id;
		this.shippingPrice = shippingPrice;
		this.productTotal = productTotal;
		this.taxTotal = calculateTaxTotal(state);
		this.grandTotal = calculateGrandTotal();
	}
	
	private float calculateGrandTotal() {
		// TODO Auto-generated method stub
		return (this.getProductTotal() + this.getTaxTotal() + this.getShippingPrice());
	}

	private float calculateTaxTotal(String state) {
		// TODO Auto-generated method stub
		float tax;
		switch(state)
		{
		case "WA":
			tax = 9.75f;
			break;
		
		case "OR":
			tax = 0f;
			break;
		case "CA":
			tax = 7.33f;
			break;
		default:
			tax = 1.0f;
			break;
		}
		return ((this.getProductTotal() * tax)/100);
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(float productTotal) {
		this.productTotal = productTotal;
	}
	public float getTaxTotal() {
		return taxTotal;
	}
	public void setTaxTotal(float taxTotal) {
		this.taxTotal = taxTotal;
	}
	public int getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(int shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public float getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}
	@Override
	public String toString() {
		return "ResponseObject [id=" + id + ", productTotal=" + productTotal + ", taxTotal=" + taxTotal
				+ ", shippingPrice=" + shippingPrice + ", grandTotal=" + grandTotal + "]";
	}
	
}

