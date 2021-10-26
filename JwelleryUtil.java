class JwelleryUtil{
    public static void main(String[] args){
	Jwellery jwellery = new Jwellery();
	Jwellery jwellery2 = new Jwellery();
	Jwellery jwellery3 = new Jwellery();
	Jwellery jwellery4 = new Jwellery();
	Jwellery jwellery5 = new Jwellery();
	System.out.println();

	jwellery.brand = "Renoy";
	jwellery.material = "Alloy";
	jwellery.theme = "Party Cuff";
	jwellery.price = 162.00;
	
	jwellery2.brand = "Vairyika";
	jwellery2.material = "Brass";
	jwellery2.theme = "Heart";
	jwellery2.price = 262.00;
	
	jwellery3.brand = "Igniva";
	jwellery3.material = "Fibric";
	jwellery3.theme = "Cuff";
	jwellery3.price = 362.00;
	
	jwellery4.brand = "Royal Bangle";
	jwellery4.material = "Crystal";
	jwellery4.theme = "Decorative Hoops";
	jwellery4.price = 462.00;
	
	jwellery5.brand = "GoldNera";
	jwellery5.material = "Gold";
	jwellery5.theme = "Bold Ethnic Stud";
	jwellery5.price = 562.00;
	
	


	jwellery.jwellerySpecification();
	System.out.println();
	jwellery2.jwellerySpecification();
	System.out.println();
	jwellery3.jwellerySpecification();
	System.out.println();
	jwellery4.jwellerySpecification();
	System.out.println();
	jwellery5.jwellerySpecification();
	System.out.println();

	jwellery.wear();
    }
}