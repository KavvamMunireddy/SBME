/**
 * 
 */
package com.muni;

import java.util.Date;
import java.util.List;

/**
 * @author KA799905
 *
 */
public class UpdateOrderValueEntry {

	private String			distributorId;
	private String			beatInstId;
	private String			orderId;
	private String			retailerId;
	private String			fsrId;
	private Date			time;
	private double			totalOrderValue;
	private List<Product>	products;

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getBeatInstId() {
		return beatInstId;
	}

	public void setBeatInstId(String beatInstId) {
		this.beatInstId = beatInstId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getFsrId() {
		return fsrId;
	}

	public void setFsrId(String fsrId) {
		this.fsrId = fsrId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
