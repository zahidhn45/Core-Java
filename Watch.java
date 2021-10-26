class Watch{
	String displayType;
	boolean waterResistance;
	String watchType;
	String mechanism;
	String color;
	
	public Watch(){
		System.out.println("Default constructor is called");
	}
	
	public Watch(String displayType, boolean waterResistance, String watchType){
		this();
		System.out.println("2nd constructor is called");
		this.displayType = displayType;
		this.waterResistance = waterResistance;
		this.watchType = watchType;
	}
	
	public Watch(String mechanism, String color){
		this("Analog", true, "Wrist Watch");
		System.out.println("3rd constructor is called");
		this.mechanism = mechanism;
		this.color = color;
	}
}