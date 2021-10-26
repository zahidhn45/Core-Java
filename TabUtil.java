class TabUtil{
    public static void main(String[] args){
	Tab tab = new Tab();
	Tab tab2 = new Tab();
	Tab tab3 = new Tab();
	Tab tab4 = new Tab();
	Tab tab5 = new Tab();
	
	System.out.println();

	tab.brand = "Realme";
	tab.os= "Android";
	tab.ram= 8;
	tab.processorType= "MediaTech";
	
	tab2.brand = "Nokia";
	tab2.os= "windows";
	tab2.ram= 4;
	tab2.processorType= "MediaTech";
	
	tab3.brand = "Oppo";
	tab3.os= "Android";
	tab3.ram= 6;
	tab3.processorType= "MediaTech";
	
	tab4.brand = "Vivo";
	tab4.os= "Android";
	tab4.ram= 6;
	tab4.processorType= "MediaTech";
	
	tab5.brand = "One Plus";
	tab5.os= "Android";
	tab5.ram= 8;
	tab5.processorType= "MediaTech";

	tab.tabSpecification();
	System.out.println();
	tab2.tabSpecification();
	System.out.println();
	tab3.tabSpecification();
	System.out.println();
	tab4.tabSpecification();
	System.out.println();
	tab5.tabSpecification();
	System.out.println();

	tab.watchingMovie();
    }
}