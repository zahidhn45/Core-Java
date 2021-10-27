import  java.util.Scanner;
class AirpotUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Airpot airpot =  new Airpot(size);
		TerminalDTO dto = new TerminalDTO();
		TerminalDTO dto1 = new TerminalDTO();
		
		dto.setTerminalArea(80000.00);
		dto.setDepartureGate(18);
		dto.setBaggageCarousels(7);
		dto.setPasswordCheckStand(45);
		
		dto1.setTerminalArea(82500.00);
		dto1.setDepartureGate(25);
		dto1.setBaggageCarousels(63);
		dto1.setPasswordCheckStand(15);
		
		airpot.addTerminal(dto);
		airpot.addTerminal(dto1);
		airpot.printDetail();
		
		boolean update = airpot.updateGateByTerminalArea(80000.00, 20);
		System.out.println("Update: "+update);
		airpot.printDetail();
		
		boolean delete = airpot.deleteByGate(20);
		System.out.println("Delete: "+delete);
		airpot.printDetail();
	}
}