class Cricket extends Game{
	int noOfPlayer;
	
	public Cricket(){
		super();
		System.out.println("Sub class  game is created");
	}
	
	public void setNoOfPlayer(int noOfPlayer){
		this.noOfPlayer = noOfPlayer;
	}
	public void printDetails(){
		System.out.println(name+ ", "+type+ ", "+noOfPlayer);
	}
}