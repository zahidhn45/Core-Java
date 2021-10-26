class HelmetUtil{
    public static void main(String[] args){
	Helmet helmet = new Helmet();
	Helmet helmet2 = new Helmet();
	Helmet helmet3 = new Helmet();
	Helmet helmet4 = new Helmet();
	Helmet helmet5 = new Helmet();
	
	System.out.println();

	helmet.brand = "VEGA";
	helmet.type = "Novelity";
	helmet.size = "L";
	
	helmet2.brand = "Steelbird";
	helmet2.type = "Motocross";
	helmet2.size = "M";
	
	helmet3.brand = "AXOR";
	helmet3.type = "Flip-up";
	helmet3.size = "XL Regular";
	
	helmet4.brand = "MAVOX";
	helmet4.type = "Half Face";
	helmet4.size = "XS";
	
	helmet5.brand = "Aaron";
	helmet5.type = "Open Face";
	helmet5.size = "M Regular";

	
	helmet.helmetSpecification();
	System.out.println();
	helmet2.helmetSpecification();
	System.out.println();
	helmet3.helmetSpecification();
	System.out.println();
	helmet4.helmetSpecification();
	System.out.println();
	helmet5.helmetSpecification();
	System.out.println();


	helmet.wear();
    }
}