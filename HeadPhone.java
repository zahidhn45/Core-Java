class Headphone{
	String brand;
	String color;
	double price;
	boolean wireless;
	
	public Headphone(){
		this(1150.00, true );
		System.out.println("Default constructor");
	}
	public Headphone(String brand, String color){
		System.out.println("Second constructor");
		this.brand =  brand;
		this.color =  color;
	}
	public Headphone(double price, boolean  wireless){
		this("Boat", "White");
		System.out.println("Third constructor");
		this.price =  price;
		this.wireless = wireless;
	}
	
	public void printDetails(){
		System.out.println(brand+  ", "+color+ ", "+price+ ", "+wireless);
	}
}