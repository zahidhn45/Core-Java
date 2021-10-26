class Router{
	String brand;
	String color;
	double price;
	int wirelessSpeed;
	String anteena;
	int lanPort;
	int numberOfAnteena;
	
	public Router(){
		System.out.println("Defalut constructor is called");
	}
	
	public Router(String brand, String color, double price){
		this();
		System.out.println("2nd constructor is called");
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Router(int wirelessSpeed, String anteena, int lanPort, int numberOfAnteena){
		this("D-Link", "Black", 950.56);
		System.out.println("3rd constructor is called");
		this.wirelessSpeed = wirelessSpeed;
		this.anteena = anteena;
		this.lanPort = lanPort;
		this.numberOfAnteena = numberOfAnteena;
	}
	
}