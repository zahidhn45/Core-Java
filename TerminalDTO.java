public class TerminalDTO{
	double terminalArea;
	int departureGate;
	int baggageCarousels;
	int passwordCheckStand;
	
	public void setTerminalArea(double terminalArea){
		this.terminalArea = terminalArea;
	}
	public double getTerminalArea(){
		return terminalArea;
	}
	public void setDepartureGate(int departureGate){
		this.departureGate =  departureGate;
	}
	public int getDepartureGate(){
		return departureGate;
	}
	public void setBaggageCarousels(int baggageCarousels){
		this.baggageCarousels =  baggageCarousels;
	}
	public int  getBaggageCarousels(){
		return baggageCarousels;
	}
	public void setPasswordCheckStand(int passwordCheckStand){
		this.passwordCheckStand  = passwordCheckStand;
	}
	public int getPasswordCheckStand(){
		return passwordCheckStand;
	}
}