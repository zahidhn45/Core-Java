class SunGlasses{
	String brand;
	String lenseColor;
	String material;
	String features;
	String faceType;
	
	public SunGlasses(){
		System.out.println("Default constructor is called");
	}
	
	public SunGlasses(String brand, String lenseColor, String material){
		this();
		System.out.println("2nd constructor is called");
		this.brand = brand;
		this.lenseColor = lenseColor;
		this.material = material;
	}
	
	public SunGlasses(String features, String faceType){
		this("Wrong", "Grey", "PolyCarbonate");
		System.out.println("3rd constructor is called");
		this.features = features;
		this.faceType = faceType;
	}
	
}