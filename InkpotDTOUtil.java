class InkpotDTOUtil{
	public static void main(String[] args){
		InkpotDTO inkPot = new InkpotDTO();
		
		inkPot.setInkpotId(567);
		inkPot.setColor("Black");
		inkPot.setPrice(555.00);
		inkPot.setMadeOf("Glass");
		
		System.out.println(inkPot.getInkpotId()+ ", "+inkPot.getColor()+ ", "+inkPot.getPrice()+ ", "+inkPot.getMadeOf());
	}
}