package com.ty.food.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillGenerate {

	@Id
	private int id;
	private String items;
	private double cost;
	private int quantity;
	private double total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "BillGenerate [id=" + id + ", items=" + items + ", cost=" + cost + ", quantity=" + quantity + ", total="
				+ total + "]";
	}
	
}
