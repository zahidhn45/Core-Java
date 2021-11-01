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

		String text = null;
		do{
			System.out.println("press 1 to get all terminal details");
			System.out.println("Press 2 to update gate no name by area");
			System.out.println("press 3 to delete terminal by gate no");
			System.out.println("press 4 to get Area name by gate number");

			int choice = sc.nextInt();
			switch(choice){
				case 1:
					airpot.printDetail();
					break;
				case 2:
					System.out.println("Enter Terminal area for which you want to update gate");
					double area = sc.nextDouble();
					System.out.println("Enter updated number of gate");
					int gate = sc.nextInt();
					boolean update = airpot.updateGateByTerminalArea(area, gate);
					System.out.println("Update: "+update);
					break;
				case 3:
					System.out.println("Enter the number of gate for which you want to delete a entery");
					boolean delete = airpot.deleteByGate(sc.nextInt());
					System.out.println("Delete: "+delete);
					break;
				case 4:
					System.out.println("Enter gate no");
					airpot.getAreaByGateNo(sc.nextInt());
				default:
					System.out.println("Wrong choice.....");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using the Food Items Application");

		sc.close();
	}
}