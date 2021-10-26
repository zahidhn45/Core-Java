class Jwellery{

    String brand;
    String material;
    String theme;
	double price;
	
	public Jwellery(){
		System.out.println("Default Jwellery constructor");
	}
    
    public void wear(){
	System.out.println("Wearing Necklace");
    }
	
	public void jwellerySpecification(){
		System.out.println(brand);
		System.out.println(material);
		System.out.println(theme);
		System.out.println(price);
	}
}
