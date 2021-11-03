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

	public FurnitureDTO getFurnitureDetailsByName(String name) {
		System.out.println("Inside getFurnitureDetailsByName()");
		FurnitureDTO dto = null;
		for (int i = 0; i < fur.length; i++) {
			if(name != null){
				if(fur[i].getFurnitureName().equals(name)){
					dto = fur[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public FurnitureDTO getFurnitureDetailsByColor(String color) {
		System.out.println("Inside getFurnitureDetailsByColor()");
		FurnitureDTO dto = null;
		for (int i = 0; i < fur.length; i++) {
			if(color != null){
				if(fur[i].getFurnitureColor().equals(color)){
					dto = fur[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public FurnitureDTO getFurnitureDetailsByNoOfFur(int num) {
		System.out.println("Inside getFurnitureDetailsByColor()");
		FurnitureDTO dto = null;
		for (int i = 0; i < fur.length; i++) {
			if(num > 0){
				if(fur[i].getNumberOfFurniture() == num){
					dto = fur[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getNameByColor(String color) {
		System.out.println("Inside getNameByColor()");
		String name = null;
		for (int i = 0; i < fur.length; i++) {
			if(color != null){
				if(fur[i].getFurnitureColor().equals(color)){
					name = fur[i].getFurnitureName();
				}
			}
		}
		return name;
	}
	public String getColorByName(String name) {
		System.out.println("Inside getColorByName()");
		String color = null;
		for (int i = 0; i < fur.length; i++) {
			if(name != null){
				if(fur[i].getFurnitureName().equals(name)){
					color = fur[i].getFurnitureColor();
				}
			}
		}
		return color;
	}
	public int getNoOfFurnatureByName(String name) {
		System.out.println("Inside getNoOfFurnatureByName()");
		int numberofFurnature = 0;
		for (int i = 0; i < fur.length; i++) {
			if(name != null){
				if(fur[i].getFurnitureName().equals(name)){
					numberofFurnature = fur[i].getNumberOfFurniture();
				}
			}
		}
		return numberofFurnature;
	}
}