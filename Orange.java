class Orange extends Fruit{
	String shape;
	String taste;
	
	public Orange(){
		super();
		System.out.println("Sub class Orange object is created");
	}
	
	
	public void setShape(String shape){
		this.shape = shape;
	}
	public void setTaste(String taste){
		this.taste = taste;
	}
	public void fruitDetails(){
		System.out.println("Name: "+name+", Calories: "+calories+ ", Vitamin: "+vitamin+ ", Mineral: "+mineral);
	}
}