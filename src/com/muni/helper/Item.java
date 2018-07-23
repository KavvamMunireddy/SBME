package com.muni.helper;

import java.util.Date;

public class Item {

	private String	referenceInstId;
	private String	itemId;
	private String	brandName;
	private String	category;
	private String	productId;
	private String	productName;
	private Money	price;
	private long	productCnt;
	private String	productImage;
	private Date	requiredDate;

	public double getTotalItemValue() {
		return price.getAmount() * productCnt;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public long getProductCnt() {
		return productCnt;
	}

	public void setProductCnt(long productCnt) {
		this.productCnt = productCnt;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReferenceInstId() {
		return referenceInstId;
	}

	public void setReferenceInstId(String referenceInstId) {
		this.referenceInstId = referenceInstId;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

}
