class Chair{

    String material;
    String color;
    String brand;
	
	public Chair(){
		System.out.println("Default Chair constructor");
	}
    
    public void sit(){
	System.out.println("Sitting on chair");
    }
	
	public void chairSpecificaation(){
		System.out.println(material);
		System.out.println(brand);
		System.out.println(color);
	}
}