class MirrorUtil{
    public static void main(String[] args){
	Mirror mirror = new Mirror();
	Mirror mirror2 = new Mirror();
	Mirror mirror3 = new Mirror();
	Mirror mirror4 = new Mirror();
	Mirror mirror5 = new Mirror();
	
	System.out.println();
	
	mirror.type = "Lighted Mirror";
	mirror.brand = "Painting Mantra";
	mirror.shape = "Oval";
	mirror.framedMaterial = "Aluminium";
	
	mirror2.type = "Decorative Mirror";
	mirror2.brand = "Aaaina";
	mirror2.shape = "Rectangle";
	mirror2.framedMaterial = "Brass";
	
	mirror3.type = "Shadow Box Mirror";
	mirror3.brand = "9face";
	mirror3.shape = "Oval";
	mirror3.framedMaterial = "Carbon Steel";
	
	mirror4.type = "Medicine Cabinet Mirror";
	mirror4.brand = "7 CR";
	mirror4.shape = "Rectangle";
	mirror4.framedMaterial = "Copper";
	
	mirror5.type = "Magnifying Mirror";
	mirror5.brand = "A R Handcraft";
	mirror5.shape = "Oval";
	mirror5.framedMaterial = "Crystal";

	mirror.mirrorSpecification();
	System.out.println();
	mirror2.mirrorSpecification();
	System.out.println();
	mirror3.mirrorSpecification();
	System.out.println();
	mirror4.mirrorSpecification();
	System.out.println();
	mirror5.mirrorSpecification();
	System.out.println();


	mirror.seeYourself();
    }
}