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
		
		
		company.printDetails();
		
		System.out.println("Enter service id to update service type");
		String id = sc.next();
		System.out.println("Enter updated service type");
		String type = sc.next();
		boolean update = company.updateServiceTypeById(type, id);
		System.out.println("Update: "+update);
		company.printDetails();
		
		System.out.println("Enter id for which an entry has to deleted");
		boolean delete = company.deleteById(sc.next());
		System.out.println("Delete: "+delete);
		company.printDetails();
		
	}
}