import  java.util.Scanner;
class AirpotUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Airpot airpot =  new Airpot(size);
		TerminalDTO dto = new TerminalDTO();
		dto.setTerminalArea(80000.00);
		dto.setDepartureGate(18);
		dto.setBaggageCarousels(7);
		dto.setPasswordCheckStand(45);
		airpot.addTerminal(dto);
		airpot.printDetail();
	}
}