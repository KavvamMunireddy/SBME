package com.muni;

import java.util.Date;
import java.util.List;

public class Instrument {

	private String						instrumentId;
	private String						referenceInstId;
	private Date						createdDate;
	private Date						requiredDate;
	private Date						dispatchDate;
	private List<com.muni.helper.Item>	items;
	private InstrumentType				instrumentType;
	private double						totalOrderValue;
	private String						deliveryType;
	private String						beatInstId;

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getReferenceInstId() {
		return referenceInstId;
	}

	public void setReferenceInstId(String referenceInstId) {
		this.referenceInstId = referenceInstId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public List<com.muni.helper.Item> getItems() {
		return items;
	}

	public void setItems(List<com.muni.helper.Item> items) {
		this.items = items;
	}

	public InstrumentType getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(InstrumentType instrumentType) {
		this.instrumentType = instrumentType;
	}

	public double getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getBeatInstId() {
		return beatInstId;
	}

	public void setBeatInstId(String beatInstId) {
		this.beatInstId = beatInstId;
	}

}
