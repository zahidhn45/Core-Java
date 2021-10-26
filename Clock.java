class Clock{
	String size;
	String mechanism;
	String frameMaterial;
	String clockType;
	boolean luxuryClock;
	int numberOfHands;
	
	public Clock(String size, String mechanism, String frameMaterial, String clockType,  boolean luxuryClock, int numberOfHands){
		this.size  =  size;
		this.mechanism = mechanism;
		this.frameMaterial = frameMaterial;
		this.clockType = clockType;
		this.luxuryClock = luxuryClock;
		this.numberOfHands =  numberOfHands;
	}
	
	public void printValues(){
		System.out.println("Size: "+size+ ", mechanism: "+mechanism+ ", Frame Material: "+frameMaterial+ ", Clock Type: "+clockType+ ", Luxury Clock: "+luxuryClock+ ", Number of Hands: "+numberOfHands);
	}
	
	public static void main(String[] args){
		Clock clock = new Clock("25x25", "Quartz", "Plastic", "Analog", true, 3);
		clock.printValues();
	}
}