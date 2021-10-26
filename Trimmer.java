class Trimmer{
	String brand;
	String modelNumber;
	String bladeMaterial;
	boolean waterResistance;
	boolean washableHead;
	int runTimeInMin;
	
	public Trimmer(){
		System.out.println("Default constructor is called");
	}
	
	public Trimmer(String brand, String modelNumber, String bladeMaterial){
		this();
		System.out.println("2nd constructor is called");
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.bladeMaterial = bladeMaterial;
	}
	
	public Trimmer(boolean waterResistance, boolean washableHead, int runTimeInMin){
		this("Beardo", "hu2545", "Stainless Steel");
		System.out.println("3rd constructor is called");
		this.waterResistance = waterResistance;
		this.washableHead =  washableHead;
		this.runTimeInMin = runTimeInMin;
	}
}