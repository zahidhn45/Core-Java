class Home{
	
	FurnitureDTO[] fur;
	int index;
	
	public Home(int size){
		fur = new FurnitureDTO[size];
	}
	
	public boolean addFurniture(FurnitureDTO fur){
		boolean isAdded = false;
		System.out.println("Inside addFurniture()");
		if(fur != null){
			System.out.println("Adding Furniture");
			this.fur[index++] = fur;
			isAdded = true;
		}
		else{
			System.out.println("Cannot add Furnature");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i = 0; i < fur.length; i++){
			if(fur[i] != null){
				System.out.println(fur[i].getFurnitureName()+ ", "+fur[i].getNumberOfFurniture()+ ", "+fur[i].getFurnitureColor());
			}
		}
	}
	
	public boolean updateColorByName(String name, String color){
		System.out.println("Inside updateColorByName()");
		boolean isUpdate = false;
		for(int i = 0; i< fur.length; i++){
			if(fur[i] != null){
				if(fur[i].getFurnitureName().equals(name)){
					fur[i].setFurnitureColor(color);
					isUpdate = true;
				}
			}
		}
		return isUpdate;
	}
	
	public boolean deleteByName(String name){
		System.out.println("Inside deleteByName()");
		boolean isDeleted = false;
		for(int i = 0; i< fur.length; i++){
			if(fur[i] != null){
				if(fur[i].getFurnitureName().equals(name)){
					fur[i] = null;
					isDeleted =  true;
				}
			}
		}
		return isDeleted;
	}
}