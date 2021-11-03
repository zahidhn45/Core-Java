import java.util.Scanner;
class LaptopUtil{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
			System.out.println("Enter size");
			int size = sc.nextInt();
			
			Laptop laptop = new Laptop(size);
			
			for(int i = 0; i < size; i++){
				OsDTO os = new OsDTO();
				
				System.out.println("Enter os name");
				os.setOsName(sc.next());
				System.out.println("Enter os size");
				os.setOsSize(sc.nextInt());
				System.out.println("Enter os Gamming Experience");
				os.setGammingExperience(sc.next());
				
				laptop.addOs(os);
			}
			String text = null;
			do{
				System.out.println("press 1 to get all  details");
				System.out.println("Press 2 to update gamming experince name by os name");
				System.out.println("press 3 to delete by name");
				System.out.println("press 4 to get os details by size");
				System.out.println("press 5 to get os details by name");
				System.out.println("press 6 to get os details by Experince");
				System.out.println("press 7 to get os name by size");
				System.out.println("press 8 to get os size by name");

				int choice = sc.nextInt();
				switch(choice){
					case 1: 
						laptop.printDetails();
						break;
					case 2:
						System.out.println("Enter os name for which gamming Exprerience is to be updated");
						String name = sc.next();
						System.out.println("Enter the updated os Gamming Experience");
						String exp = sc.next();
						boolean update = laptop.updategammingByName(name, exp);
						System.out.println("Update: "+update);
						break;
					case 3:
						System.out.println("Enter os name for which en entry has to be deleted");
						boolean delete = laptop.deleteByName(sc.next());
						System.out.println("Delete: "+delete);
						break;
					case 4:
						System.out.println("Enter os size");
						OsDTO dto = laptop.getOsDetailsByOsSize(sc.nextInt());
						if(dto != null){
							System.out.println(dto.getOsName()+" "+dto.getOsSize()+" "+dto.getGammingExperince());
						}
						break;
					case 5:
						System.out.println("Enter os size");
						OsDTO dto1 = laptop.getOsDetailsByOsName(sc.next());
						if(dto1 != null){
							System.out.println(dto1.getOsName()+" "+dto1.getOsSize()+" "+dto1.getGammingExperince());
						}
						break;
					case 6:
						System.out.println("Enter os gamming experince");
						OsDTO dto2 = laptop.getOsDetailsByOsGamming(sc.next());
						if(dto2 != null){
							System.out.println(dto2.getOsName()+" "+dto2.getOsSize()+" "+dto2.getGammingExperince());
						}
						break;
					case 7:
						System.out.println("Enter os size");
						System.out.println(laptop.getOsNameByOsSize(sc.nextInt()));
						break;
					case 8:
						System.out.println("Enter os name");
						System.out.println(laptop.getOsSizeByOsName(sc.next()));
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