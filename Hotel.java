
class Hotel{
	
	FoodItemDTO[] foodItem;
	int index;
	
	public Hotel(int size){
		foodItem = new FoodItemDTO[size];
	}
	
	public boolean createFoodItem(FoodItemDTO foodItem){
		System.out.println("Inside createFoodItem()");
		boolean isCreated = false;
		if(foodItem != null){
			System.out.println("Creating food Item");
			this.foodItem[index++] = foodItem;
			isCreated = true;
		}
		else{
			System.out.println("Food details not found");
		}
		return isCreated;
	}
	public boolean fetchFoodDetail(){
		boolean found = false;
		for(int i = 0; i< foodItem.length; i++){
			if(foodItem[i] != null){
				System.out.println(foodItem[i].getFoodId()+ " "+foodItem[i].getFoodName()+ " "+foodItem[i].getFoodPrice()+ " "+foodItem[i].getFoodType());
				found = true;
			}
		}
		if(!found){
			System.out.println("No food item found");
		}
		return found;
	}
	
	public boolean updateFoodNameByFoodId(int id, String name){
		System.out.println("Inside updateFoodNameByFoodId()");
		boolean isUpdated = false;
		if(this.foodItem != null){
			for(int i = 0; i< foodItem.length; i++){
				if(foodItem[i] != null){
					if(foodItem[i].getFoodId() == id){
						foodItem[i].setFoodName(name);
						isUpdated = true;
					}
				}
			}
		}
		else{
			System.out.println("Nothing found to update");
		}
		return isUpdated;
	}
	public boolean updateFoodPriceByFoodId(int id, double price){
		System.out.println("Inside updateFoodNameByFoodId()");
		boolean isUpdated = false;
		for(int i = 0; i< foodItem.length; i++){
			if(foodItem[i] != null){
				if(foodItem[i].getFoodId() == id){
					foodItem[i].setFoodPrice(price);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	public boolean updateFoodTypeByFoodId(int id, String type){
		System.out.println("Inside updateFoodNameByFoodId()");
		boolean isUpdated = false;
		for(int i = 0; i< foodItem.length; i++){
			if(foodItem[i] != null){
				if(foodItem[i].getFoodId() == id){
					foodItem[i].setFoodType(type);
					isUpdated = true;
				}
			} 
		}
		return isUpdated;
	}
	public boolean deleteByFoodId(int id){
		System.out.println("Inside deleteByFoodId()");
		boolean isDeleted = false;
		for(int i = 0; i< foodItem.length; i++){
			if(foodItem[i] != null){
				if(foodItem[i].getFoodId() == id){
				foodItem[i] = null;
					isDeleted =true;
				}
			}
		}
		return isDeleted;
	}
}