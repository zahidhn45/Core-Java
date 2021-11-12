package com.xworkz.crudoperationapp;

public class Hotel {

	FoodItemDTO[] fooditem;
	int index;

	public Hotel(int size) {
		fooditem = new FoodItemDTO[size];
	}

	public boolean createFoodItem(FoodItemDTO foodItem) {
		System.out.println("Inside  createFoodItem()");
		boolean isCreated = false;
		if (foodItem != null) {
			System.out.println("Got the food item");
			this.fooditem[index++] = foodItem;
			isCreated = true;
		}
		return isCreated;
	}

	public void fetchFoodItem() {
		System.out.println("Inside fetchFoodItem()");
		for (int i = 0; i < fooditem.length; i++) {
			if (fooditem != null) {
				System.out.println(fooditem[i].getFoodId() + ", " + fooditem[i].getFoodName() + ", "
						+ fooditem[i].getFoodPrice() + ", " + fooditem[i].getFoodType());
			}
		}
	}

	public boolean updateFoodItemNameById(int id, String name) {
		System.out.println("Inside updateFoodItemNameById()");
		boolean isUpdated = false;
		for (int i = 0; i < fooditem.length; i++) {
			if (fooditem[i] != null) {
				if (fooditem[i].getFoodId() == id) {
					name = fooditem[i].getFoodName();
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}

	public boolean deleteFoodItemByFoodId(int id) {
		System.out.println("Inside deleteFoodItemByFoodId()");
		boolean isDeleted = false;
		for (int i = 0; i < fooditem.length; i++) {
			if (fooditem[i] != null) {
				if (fooditem[i].getFoodId() == id) {
					id = fooditem[i].getFoodId();
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
}
