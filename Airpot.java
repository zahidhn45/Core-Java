class Airpot{
	TerminalDTO[] terminal;
	int index;
	
	public Airpot(int size){
		terminal =  new TerminalDTO[size];
	}
	
	public boolean addTerminal(TerminalDTO terminal){
		boolean isAdded =  false;
		System.out.println("Inside addTerminal()");
		if(terminal != null){
			System.out.println("Addind terminal");
			this.terminal[index++] = terminal;
			isAdded = true;
		}
		else{
			System.out.println("Unable to add Terminal");
		}
		return isAdded;
	}
	public void printDetail(){
		for(int i = 0; i < terminal.length; i++){
			System.out.println(terminal[i].getTerminalArea()+ ", "+terminal[i].getDepartureGate()+ ", "+terminal[i].getBaggageCarousels()+ ", "+terminal[i].getPasswordCheckStand());
		}
	}
}