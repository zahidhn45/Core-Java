class Helmet{

    String brand;
    String type;
    String size;
    
	public Helmet(){
		System.out.println("Default Helmet constructor");
	}
	
    public void wear(){
		System.out.println("Wearing Helmet");
    }
	
	public  void helmetSpecification(){
		System.out.println(brand);
		System.out.println(type);
		System.out.println(size);
	}
	
	
}
