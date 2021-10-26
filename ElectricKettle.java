class ElectricKettle{
	String brand;
	double price;
	String material;
	String suitableFor;
	int capacityInLtr;
	
	public ElectricKettle(){
		System.out.println("Default constructor is called");
	}
	
	public ElectricKettle(String brand, double price){
		this();
		System.out.println("2nd constructor is called");
		this.brand = brand;
		this.price = price;
	}
	
	public ElectricKettle(String material, String suitableFor, int capacityInLtr){
		this("Pigeon", 624.20);
		System.out.println("3rd constructor is called");
		this.material = material;
		this.suitableFor = suitableFor;
		this.capacityInLtr = capacityInLtr;
	}
}