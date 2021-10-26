class Clothes{

	String brand;
    String neckType;
    String febric;
	String pattern;
	String sleeveType;
    String size;
    
	public Clothes(){
		System.out.println("Default clothes constructor");
	}
	
    public void wear(){
		System.out.println("Wearing TShirt");
    }
	
	public void clothesSpecification(){
		System.out.println(brand);
		System.out.println(neckType);
		System.out.println(febric);
		System.out.println(pattern);
		System.out.println(sleeveType);
		System.out.println(size);
	}
}
