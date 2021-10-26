class HardDisk{
	String brand;
	String kind;
	int capacity;
	
	public HardDisk(String brand, String kind, int capacity){
		this.brand = brand;
		this.kind = kind;
		this.capacity = capacity;
	}
	public void printDetails(){
		System.out.println("Inside printDetails()");
		System.out.println("Brand: "+this.brand);
		System.out.println("Kind: "+this.kind);
		System.out.println("Capacity: "+this.capacity);
	}
	
}