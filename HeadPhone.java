class HeadPhone{

    String features;
    String color;
    String brand;
    
	public HeadPhone(){
		System.out.println("Default HeadPhone constructor");
	}
	
    public void listen(){
		System.out.println("Listening music through HeadPhone");
    }
	
	public void headPhoneSpecification(){
		System.out.println(features);
		System.out.println(color);
		System.out.println(brand);
	}
}
