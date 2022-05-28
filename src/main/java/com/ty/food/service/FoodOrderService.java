package com.ty.food.service;

import static com.ty.food.dto.Tax.*;

import java.util.List;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderService {

	FoodOrderDao dao = new FoodOrderDao();

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return dao.saveFoodOreder(foodOrder);
	}

	public FoodOrder getFoodOrderById(int id) {
		return dao.getFoodOrderById(id);
	}

	public FoodOrder deleteFooodOrderById(int id) {
		return deleteFooodOrderById(id);
	}

	public FoodOrder updateFoodOrder(int id, Item item) {
		return dao.updateFoodOrder(id, item);
	}

	public List<FoodOrder> getFoodOrderByPhone(long phone) {
		return dao.getFoodOrderByPhone(phone);
	}

	public List<FoodOrder> getFoodOrdersByName(String name) {

		return dao.getFoodOrdersByName(name);
	}

	public double billGenerated(double amount) {
		double gst = amount + getCgst(amount) + getSgst(amount);
		return gst;
	}

	public double getCgst(double amount) {
		return amount *(CGST/100);
	}

	public double getSgst(double amount) {
		return amount * (SGST/100);
	}

}
