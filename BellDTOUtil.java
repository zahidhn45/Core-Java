class BellDTOUtil{

	
	public static void main(String[] args){
		BellDTO bell = new BellDTO();
		BellDTO bell1 = new BellDTO("Agenta", "blue", "pastic", false);
		System.out.println(bell1);
		
		bell.setBrand("Anchor");
		bell.setColor("White");
		bell.setMaterial("Plastic");
		bell.setWeatherProof(false);
		
		System.out.println(bell);
	}
}