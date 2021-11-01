import java.util.Scanner;
class CompanyUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Company company = new Company(size);
		
		for(int i = 0; i< size; i++){
			ServiceDTO dto = new ServiceDTO();
			
			System.out.println("Enter Service id");
			dto.setServiceRegisterId(sc.next());
			System.out.println("Enter servic  type");
			dto.setServiceType(sc.next());
			
			company.addService(dto);
		}
		String text = null;
		do{
			System.out.println("press 1 to get all service details");
			System.out.println("Press 2 to update service type name by id");
			System.out.println("press 3 to delete service by id");
			System.out.println("press 4 to get service type by service id");
			int choice = sc.nextInt();

			switch(choice){
				case 1:
					company.printDetails();
					break;
				case 2:
					System.out.println("Enter service id to update service type");
					String id = sc.next();
					System.out.println("Enter updated service type");
					String type = sc.next();
					boolean update = company.updateServiceTypeById(type, id);
					System.out.println("Update: "+update);
					break;
				case 3:
					System.out.println("Enter id for which an entry has to deleted");
					boolean delete = company.deleteById(sc.next());
					System.out.println("Delete: "+delete);
					break;
				case 4:
					System.out.println("Enter id");
					company.getServiceTypeById(sc.next());
					break;
				default:
					System.out.println("Wrong choice.....");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using the Food Items Application");
	}
}