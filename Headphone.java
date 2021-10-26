class Headphone{
	String brand;
	String color;
	boolean wireless;
	double price;
	int range;
	
	public Headphone(String brand, String color,  boolean wireless, double price, int range){
		this.brand =  brand;
		this.color = color;
		this.wireless = wireless;
		this.price = price;
		this.range = range;
	}
	public void printDetails(){
		System.out.println(brand+ ", "+color+ ", "+wireless+ ", "+price+ ", "+range);
	}
	public static void main(String[] args){
		Headphone headphone =  new Headphone("JBL", "Black", false,  2050.00, 10);
		headphone.printDetails();
	}
}