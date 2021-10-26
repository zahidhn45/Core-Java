class Shoe{

    String color;
    String brand;
    int size;
	
	public Shoe(){
		System.out.println("Default Shoe constructor");
	}
    
    public void wear(){
		System.out.println("Wearing shoes");
    }
	
	public void shoeSpecification(){
		System.out.println(color);
		System.out.println(brand);
		System.out.println(size);
	}
}