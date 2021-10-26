class Threads{
	
	String brand;
	String type;
	int lengthInCM;
	String material;
	String color;
	
	public Threads(String brand, String type, int lengthInCM, String material, String color){
		this.brand = brand;
		this.type = type;
		this.lengthInCM = lengthInCM;
		this.material = material;
		this.color = color;
	}
	
	public void printValues(){
		System.out.println(brand+" "+type+" "+lengthInCM+" "+material+" "+color);
	}
	public static void main(String[] args){
		Threads threads = new Threads("NA Fashon", "Regular Thread", 200, "Polyester", "Black");
		threads.printValues();
	}
}