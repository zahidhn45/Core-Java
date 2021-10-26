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
			System.out.println(fur[i].getFurnitureName()+ ", "+fur[i].getNumberOfFurniture()+ ", "+fur[i].getFurnitureColor());
		}
	}
}