class TrimmerDTOUtil{
	public static void main(String[] args){
		TrimmerDTO trimmer = new TrimmerDTO();
		trimmer.setBrand("Beardo");
		trimmer.setBladeMaterial("Steel");
		trimmer.setWaterResistance(true);
		trimmer.setPrice(1560.00);
		
		System.out.println(trimmer.getBrand()+ ", "+trimmer.getBladeMaterial()+ ", "+trimmer.getWaterResistance()+ ", "+trimmer.getPrice());
		System.out.println(trimmer);
	}
}