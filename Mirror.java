class Mirror{

    String type;
    String brand;
    String shape;
	String framedMaterial;
    
	public Mirror(){
		System.out.println("Default Mirror constructor");
	}
    
    public void seeYourself(){
	System.out.println("seeing in mirror");
    }
	
	public void mirrorSpecification(){
		System.out.println(type);
		System.out.println(brand);
		System.out.println(shape);
		System.out.println(framedMaterial);
	}
}