package com.ty.invoice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ty.item.dto.Item;
@Entity
public class Invoice {
	@Id
	private int id;
	private String billAddress;
	private String gst;
	private double tax;
	@OneToOne
	private Item item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBillAddress() {
		return billAddress;
	}
	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

}
