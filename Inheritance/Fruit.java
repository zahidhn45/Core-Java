class Fruit{
	String name;
	String calories;
	String vitamin;
	String mineral;
	
	public Fruit(){
		System.out.println("Super class Fruit object is created");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setCalories(String calories){
		this.calories = calories;
	}
	public void setVitamin(String vitamin){
		this.vitamin = vitamin;
	}
	public void setMineral(String mineral){
		this.mineral = mineral;
	}
	public void fruitDetails(){
		System.out.println("Fruit details");
	}
}