class Bulb{
	String brand;
	String type;
	double price;
	
	public Bulb(String brand, String type, double price){
		this.brand = brand;
		this.type = type;
		this.price =  price;
	}
	
	public void printValues(){
	System.out.println(brand+" "+type+" "+price);
	}
	
	public static void main(String[] args){
		Bulb bulb = new Bulb("Syska", "LED", 450.00);
		Bulb bulb2 = new Bulb("Syska", "LED", 450.00);
		Bulb bulb3 = new Bulb("Syska", "LED", 450.00);
		Bulb bulb4 = new Bulb("Syska", "LED", 450.00);
		bulb.printValues();
		bulb2.printValues();
		bulb3.printValues();
		bulb4.printValues();
	}
}