import  java.util.Scanner;
class AirpotUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Airpot airpot =  new Airpot(size);
		
		for(int i = 0; i< size; i++){
			TerminalDTO dto = new TerminalDTO();
			System.out.println("Enter Terminal Area");
			dto.setTerminalArea(sc.nextDouble());
			System.out.println("Enter Number of Departure gate");
			dto.setDepartureGate(sc.nextInt());
			System.out.println("Enter bumber of Baggage Carousels");
			dto.setBaggageCarousels(sc.nextInt());
			System.out.println("Enter number of passport check stand");
			dto.setPasswordCheckStand(sc.nextInt());
			airpot.addTerminal(dto);
		}
		
		airpot.printDetail();
		
		System.out.println("Enter Terminal area for which you want to update gate");
		double area = sc.nextDouble();
		System.out.println("Enter updated number of gate");
		int gate = sc.nextInt();
		boolean update = airpot.updateGateByTerminalArea(area, gate);
		System.out.println("Update: "+update);
		airpot.printDetail();
		
		System.out.println("Enter the number of gate for which you want to delete a entery");
		boolean delete = airpot.deleteByGate(sc.nextInt());
		System.out.println("Delete: "+delete);
		airpot.printDetail();
	}
}