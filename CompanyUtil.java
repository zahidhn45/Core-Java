import java.util.Scanner;
class CompanyUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Company company = new Company(size);
		ServiceDTO dto = new ServiceDTO();
		dto.setServiceRegisterId("utg45l12");
		dto.setServiceType("Full time");
		
		company.addService(dto);
		company.printDetails();
	}
}