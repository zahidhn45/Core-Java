class ClothesUtil{
    public static void main(String[] args){
	Clothes clothes = new Clothes();
	Clothes clothes2 = new Clothes();
	Clothes clothes3 = new Clothes();
	Clothes clothes4 = new Clothes();
	Clothes clothes5 = new Clothes();
	
	System.out.println();

	clothes.brand = "London Hills";
	clothes.neckType = "Hooded Neck";
	clothes.febric = "cotton";
	clothes.pattern = "Striped";
	clothes.sleeveType = "Full sleeve";
	clothes.size = "XL";
	
	clothes2.brand = "Headzup";
	clothes2.neckType = "Polo Neck";
	clothes2.febric = "cotton Silk";
	clothes2.pattern = "Solid";
	clothes2.sleeveType = "Sleeveless";
	clothes2.size = "L";
	
	clothes3.brand = "Supreme";
	clothes3.neckType = "V Neck";
	clothes3.febric = "Polyster";
	clothes3.pattern = "Printed";
	clothes3.sleeveType = "3/4 Sleeve";
	clothes3.size = "S";
	
	clothes4.brand = "venuz";
	clothes4.neckType = "cowl Neck";
	clothes4.febric = "PolyCotton";
	clothes4.pattern = "Checkered";
	clothes4.sleeveType = "Short Sleeve";
	clothes4.size = "M";
	
	clothes5.brand = "Tio Sport";
	clothes5.neckType = "Round Neck";
	clothes5.febric = "Hoeisery";
	clothes5.pattern = "Sport";
	clothes5.sleeveType = "Half sleeve";
	clothes5.size = "XL";

	clothes.clothesSpecification();
	System.out.println();
	clothes2.clothesSpecification();
	System.out.println();
	clothes3.clothesSpecification();
	System.out.println();
	clothes4.clothesSpecification();
	System.out.println();
	clothes5.clothesSpecification();
	System.out.println();

	clothes.wear();
    }
}