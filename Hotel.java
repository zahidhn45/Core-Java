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

	public FoodItemsDTO getFoodDetailsById(int id) {
		System.out.println("Inside getFoodDetailsById()");
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
	public FoodItemsDTO getFoodDetailsByName(String name) {
		System.out.println("Inside getFoodDetailsByName()");
		FoodItemsDTO dto = null;
		for (int i = 0; i < foodItems.length; i++) {
			if(name != null){
				if(foodItems[i].getFoodName().equals(name)){
					dto = foodItems[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public FoodItemsDTO getFoodDetailsByType(String type) {
		System.out.println("Inside getFoodDetailsByType()");
		FoodItemsDTO dto = null;
		for (int i = 0; i < foodItems.length; i++) {
			if(type != null){
				if(foodItems[i].getFoodName().equals(type)){
					dto = foodItems[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public FoodItemsDTO getFoodDetailsByPrice(double price) {
		System.out.println("Inside getFoodDetailsByprice()");
		FoodItemsDTO dto = null;
		for (int i = 0; i < foodItems.length; i++) {
			if(price > 0){
				if(foodItems[i].getFoodPrice() == price){
					dto = foodItems[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getFoodNameByFoodId(int id) {
		System.out.println("Inside getFoodNameByFoodId()");
		String name = null;
		for (int i = 0; i < foodItems.length; i++) {
			if(id > 0){
				if(foodItems[i].getFoodId() == id){
					name = foodItems[i].getFoodName();
				}
			}else{
				System.out.println("Not found");
			}
		}
		return name;
	}
	public double getFoodPriceByFoodName(String name) {
		System.out.println("Inside getFoodPriceByFoodName()");
		double price = 0.0;
		for (int i = 0; i < foodItems.length; i++) {
			if(name != null){
				if(foodItems[i].getFoodName().equals(name)){
					price = foodItems[i].getFoodPrice();
				}
			}else{
				System.out.println("Not found");
			}
		}
		return price;
	}
}