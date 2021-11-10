class CupDTOUtil{
	public static void main(String[] args){
		CupDTO cup = new CupDTO();
		cup.setColor("White");
		cup.setScratchResistance(true);
		cup.setCapacity("180 ml");
		
		System.out.println(cup.getColor()+ ", "+cup.getScratchResistance()+ ", "+cup.getCapacity());
		System.out.println(cup);
	}
}