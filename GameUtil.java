class GameUtil{
	public static void main(String[] args){
		Cricket cricket = new Cricket();
		cricket.setName("Cricket");
		cricket.setType("Game");
		cricket.setNoOfPlayer(11);
		cricket.play();
		cricket.printDetails();
	}
}