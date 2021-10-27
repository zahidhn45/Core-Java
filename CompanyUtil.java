import java.util.Scanner;
class CompanyUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Company company = new Company(size);
		ServiceDTO dto = new ServiceDTO();
		ServiceDTO dto1 = new ServiceDTO();
		
		dto.setServiceRegisterId("utg45l12");
		dto.setServiceType("Full time");
		
		dto1.setServiceRegisterId("ght40l12");
		dto1.setServiceType("Full time");
		
		company.addService(dto);
		company.addService(dto1);
		company.printDetails();
		
		boolean update = company.updateServiceTypeById("Part Time", "utg45l12");
		System.out.println("Update: "+update);
		company.printDetails();
		
		boolean delete = company.deleteById("ght40l12");
		System.out.println("Delete: "+delete);
		company.printDetails();
		
	}
}