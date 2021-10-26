class HatDTOUtil{
	public static void main(String[] args){
		HatDTO hat = new HatDTO();
		
		hat.setColor("Black");
		hat.setPrice(480.00);
		hat.setFabric("Cotton");
		hat.setPattern("Solid");
		
		System.out.println(hat.getColor()+ ",  "+hat.getPrice()+ ",  "+hat.getFabric()+ ", "+hat.getPattern());
	}
}