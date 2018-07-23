/**
 * 
 */
package com.muni;

/**
 * @author KA799905
 *
 */
public class Product {

	private String	productId;
	private String	brandName;
	private double	price;
	private long	productCnt;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getProductCnt() {
		return productCnt;
	}

	public void setProductCnt(long productCnt) {
		this.productCnt = productCnt;
	}

}
