class HeadPhoneUtil{
    public static void main(String[] args){
	HeadPhone headPhone = new HeadPhone();
	HeadPhone headPhone2 = new HeadPhone();
	HeadPhone headPhone3 = new HeadPhone();
	HeadPhone headPhone4 = new HeadPhone();
	HeadPhone headPhone5 = new HeadPhone();
	System.out.println();

	headPhone.features = "Deep Base";
	headPhone.color = "Black";
	headPhone.brand = "Boat";
	
	headPhone2.features = "Flat Wire";
	headPhone2.color = "Blue";
	headPhone2.brand = "OnePlue";
	
	headPhone3.features = "Sweat proof";
	headPhone3.color = "Brown";
	headPhone3.brand = "Realme";
	
	headPhone4.features = "True Wireless";
	headPhone4.color = "Silver";
	headPhone4.brand = "Sony";
	
	headPhone5.features = "Water Resistant";
	headPhone5.color = "White";
	headPhone5.brand = "Ubon";

	headPhone.headPhoneSpecification();
	System.out.println();
	headPhone2.headPhoneSpecification();
	System.out.println();
	headPhone3.headPhoneSpecification();
	System.out.println();
	headPhone4.headPhoneSpecification();
	System.out.println();
	headPhone5.headPhoneSpecification();
	System.out.println();
	

	headPhone.listen();
    }
}