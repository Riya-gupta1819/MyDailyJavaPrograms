package com.riya.itc;

public class RestaurantSystem {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("KFC");
		System.out.println("Welcome to " + restaurant.getRestaurantName() + "Restaurant!!!");
		Waiter waiter = new Waiter(restaurant);
		Chef chef = new Chef(restaurant);
		
		waiter.acceptOrder("Fried rice");
		waiter.start();
		chef.start();

	}

}
