package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestGetAllUser {

	public static void main(String[] args) {

		UserService service = new UserService();

		System.out.println(service.getAllUser());
	}
}
