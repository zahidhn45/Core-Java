class Television{
	String brand;
	String screenSize;
	String operatingSystem;
	boolean smartTV;
	int numberOfHDMIPort;
	
	public Television(String brand, String screenSize, String operatingSystem, boolean smartTV, int numberOfHDMIPort){
		this.brand = brand;
		this.screenSize = screenSize;
		this.operatingSystem = operatingSystem;
		this.smartTV = smartTV;
		this.numberOfHDMIPort = numberOfHDMIPort;
	}
	
	
	public void printValue(){
		System.out.println(brand +" " + screenSize +" "+operatingSystem+" "+smartTV+" "+numberOfHDMIPort);
	}
	
	
	public static void main(String[] args){
		Television tv = new Television("Samsung", "300x400", "Android", true, 2);
		Television tv2 = new Television("Sony", "720x1080","Android", false, 1);
		tv.printValue();
		tv2.printValue();
	}
	
}