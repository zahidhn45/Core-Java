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
	public void fetchFoodItems(){
		for(int i=0; i<foodItems.length;  i++){
			if(foodItems[i] != null){
				System.out.println(foodItems[i].getFoodId()+ ", "+foodItems[i].getFoodName()+ ", "+foodItems[i].getFoodPrice()+ ", "+foodItems[i].getFoodType());
			}
		}
	}
	
	public boolean updateFoodNameByFoodId(int id,  String name){
		System.out.println("Inside updateFoodNameByFoodId()");
		boolean isUpdated =  false;
		for(int i = 0; i< foodItems.length; i++){
			if(foodItems[i] != null){
				if(foodItems[i].getFoodId() == id){
					foodItems[i].setFoodName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	
	public boolean DeleteByFoodId(int id){
		System.out.println("Inside DeleteByFoodId()");
		boolean isDeleted =  false;
		for(int i = 0; i< foodItems.length; i++){
			if(foodItems[i] != null){
				if(foodItems[i].getFoodId() == id){
					foodItems[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	public FoodItemsDTO getFoodNameById(int id) {
		System.out.println("Inside getFoodNameById()");
		FoodItemsDTO dto = null;
		for (int i = 0; i < foodItems.length; i++) {
			if(id > 0){
				if(foodItems[i].getFoodId() == id){
					dto = foodItems[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
}