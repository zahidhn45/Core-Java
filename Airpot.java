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
			if(terminal[i] != null){
				System.out.println(terminal[i].getTerminalArea()+ ", "+terminal[i].getDepartureGate()+ ", "+terminal[i].getBaggageCarousels()+ ", "+terminal[i].getPasswordCheckStand());
			}
			
		}
	}
	public boolean updateGateByTerminalArea(double terminalArea, int gate){
		boolean isUpdated = false;
		System.out.println("Inside updateGateByTerminalArea()");
		if(terminalArea > 0.0 && gate > 0){
			System.out.println("Updating Gate");
			for(int i =0; i<terminal.length; i++){
				if(terminal[i].getTerminalArea() == terminalArea){
					terminal[i].setDepartureGate(gate);
					isUpdated = true;
				}
				else{
					System.out.println("No such record found");
				}
			}
		}
		return isUpdated;
	}
	
	public boolean deleteByGate(int gate){
		System.out.println("Inside deleteByGate()");
		boolean isDeleted = false;
		for(int i = 0; i < terminal.length; i++){
			if(terminal[i] != null){
				if(terminal[i].getDepartureGate() == gate){
					terminal[i] = null;
					isDeleted  = true;
				}
			}
			else{
				System.out.println("Cannot find terminal");
			}
		}
		return isDeleted;
	}

	public TerminalDTO getAreaByGateNo(int gate) {
		System.out.println("Inside getAreaByGateNo()");
		TerminalDTO dto = null;
		for (int i = 0; i < terminal.length; i++) {
			if(gate > 0){
				if(terminal[i].getDepartureGate() == gate){
					dto = terminal[i];
				}else{
					System.out.println("Not available");
				}
			}
		}
		return dto;
	}
}