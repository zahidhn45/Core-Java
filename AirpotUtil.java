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
			System.out.println("press 4 to get terminal details by gate number");
			System.out.println("press 5 to get terminal details by Terminal area");
			System.out.println("press 6 to get terminal details by Terminal no of courosel");
			System.out.println("press 7 to get terminal area by Terminal no of gate");
			System.out.println("press 8 to get terminal courosel by Terminal no of gate");
			System.out.println("press 9 to get terminal Area by Terminal no of password check stand");

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
					TerminalDTO dto = airpot.getTerminalDetailsByGateNo(sc.nextInt());
					if(dto != null){
						System.out.println(dto.getTerminalArea()+" "+dto.getDepartureGate()+" "+dto.getBaggageCarousels()+" "+dto.getPasswordCheckStand());
					}
					break;
				case 5:
					System.out.println("Enter terminal area");
					TerminalDTO dto1 = airpot.getTerminalDetailsByArea(sc.nextDouble());
					if(dto1 != null){
						System.out.println(dto1.getTerminalArea()+" "+dto1.getDepartureGate()+" "+dto1.getBaggageCarousels()+" "+dto1.getPasswordCheckStand());
					}
					break;
				case 6:
					System.out.println("Enter Number of courosel");
					TerminalDTO dto2 = airpot.getTerminalDetailsByCoursoul(sc.nextInt());
					if(dto2 != null){
						System.out.println(dto2.getTerminalArea()+" "+dto2.getDepartureGate()+" "+dto2.getBaggageCarousels()+" "+dto2.getPasswordCheckStand());
					}
					break;
				case 7:
					System.out.println("Enter gate");
					double gate1 = airpot.getAreabyGate(sc.nextInt());
					System.out.println(gate1);
					break;
				case 8:
					System.out.println("Enter gate");
					int courosel = airpot.getcorouselbyGate(sc.nextInt());
					System.out.println(courosel);
					break;
				case 9:
					System.out.println("Enter no of password check stand");
					double check = airpot.getArealbyPassportCheckStand(sc.nextInt());
					System.out.println(check);
					break;

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