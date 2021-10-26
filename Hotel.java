class Hotel{
	
	FoodItemsDTO[] foodItems;
	int index;
	
	public Hotel(int size){
		foodItems = new FoodItemsDTO[size];
	}
	
	public boolean addFoodItems(FoodItemsDTO foodItems){
		boolean isAdded = false;
		System.out.println("Inside addFoodItems()");
		if(foodItems != null){
			System.out.println("got the food item");
			this.foodItems[index++] = foodItems;
			isAdded = true;
		}
		else{
			System.out.println("cannot add food items");
		}
		return isAdded;
	}
	public void getFoodItems(){
		for(int i=0; i<foodItems.length;  i++){
			System.out.println(foodItems[i].getFoodId()+ ", "+foodItems[i].getFoodName()+ ", "+foodItems[i].getFoodPrice()+ ", "+foodItems[i].getFoodType());
		}
	}
}