class Tab{

    String os;
    int ram;
    String processorType;
	String brand;
	
	public Tab(){
		System.out.println("Default Tab constructor");
	}
    
    public void watchingMovie(){
		System.out.println("Watching Movie");
    }
	
	public void tabSpecification(){
		System.out.println(brand);
		System.out.println(os);
		System.out.println(ram);
		System.out.println(processorType);
	}
}
