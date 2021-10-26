class Tomato extends Vegetable{
	String name;
	String color;
	
	public void setName(String name){
		this.name = name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void VegDetail(){
		System.out.println("Name: "+name+ ", Color: "+color+ ", Calories: "+calories+ ", Vitamin: "+vitamin+ ", Mineral: "+mineral);
	}
}