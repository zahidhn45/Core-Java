class ShoeUtil{
    public static void main(String[] args){
	Shoe shoe = new Shoe();
	Shoe shoe2 = new Shoe();
	Shoe shoe3 = new Shoe();
	Shoe shoe4 = new Shoe();
	Shoe shoe5 = new Shoe();
	
	System.out.println();
	
	shoe.color = "Black";
	shoe.brand = "Puma";
	shoe.size = 8;
	
	shoe2.color = "Brown";
	shoe2.brand = "Nike";
	shoe2.size = 7;
	
	shoe3.color = "Blue";
	shoe3.brand = "Adidas";
	shoe3.size = 6;
	
	shoe4.color = "Natural";
	shoe4.brand = "Campus";
	shoe4.size = 10;
	
	shoe5.color = "Navy";
	shoe5.brand = "Reebook";
	shoe5.size = 11;

	shoe.shoeSpecification();
	System.out.println();
	shoe2.shoeSpecification();
	System.out.println();
	shoe3.shoeSpecification();
	System.out.println();
	shoe4.shoeSpecification();
	System.out.println();
	shoe5.shoeSpecification();
	System.out.println();

	shoe.wear();
    }
}