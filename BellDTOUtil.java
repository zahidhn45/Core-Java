class BellDTOUtil{
	public static void main(String[] args){
		//BellDTO bell = new BellDTO();
		BellDTO bell1 = new BellDTO("abc", "blue", "pastic", false);
		
		System.out.println(bell1.getBrand()+ ", "+bell1.getColor()+ ", "+bell1.getMaterial()+ ", "+bell1.getWeatherProof());
		
		bell1.setBrand("Anchor");
		bell1.setColor("White");
		bell1.setMaterial("Plastic");
		bell1.setWeatherProof(false);
		
		System.out.println(bell1.getBrand()+ ", "+bell1.getColor()+ ", "+bell1.getMaterial()+ ", "+bell1.getWeatherProof());
	}
}