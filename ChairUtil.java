class ChairUtil{
    public static void main(String[] args){
	Chair chair = new Chair();
	Chair chair2 = new Chair();
	Chair chair3 = new Chair();
	Chair chair4 = new Chair();
	Chair chair5 = new Chair();
	
	System.out.println();

	chair.material = "Plastic";
	chair.brand = "Durian";
	chair.color = "Black";
	
	chair2.material = "Fabric";
	chair2.brand = "Supreme";
	chair2.color = "Blue";
	
	chair3.material = "Metal";
	chair3.brand = "cello";
	chair3.color = "Maroon";
	
	chair4.material = "Foam";
	chair4.brand = "Patelraj";
	chair4.color = "Grey";
	
	chair5.material = "Solid Wood";
	chair5.brand = "Highway";
	chair5.color = "Purple";
	
	chair.chairSpecificaation();
	System.out.println();
	chair2.chairSpecificaation();
	System.out.println();
	chair3.chairSpecificaation();
	System.out.println();
	chair4.chairSpecificaation();
	System.out.println();
	chair5.chairSpecificaation();
	System.out.println();

	
	chair.sit();
    }
}