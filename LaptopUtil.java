import java.util.Scanner;
class LaptopUtil{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
			System.out.println("Enter size");
			int size = sc.nextInt();
			
			Laptop laptop = new Laptop(size);
			OsDTO os = new OsDTO();
			OsDTO os1 = new OsDTO();
			
			os.setOsName("Windows");
			os.setOsSize(10);
			os.setGammingExperience("Nice");
			
			os1.setOsName("Linux");
			os1.setOsSize(5);
			os1.setGammingExperience("poor");
			
			laptop.addOs(os);
			laptop.addOs(os1);
			laptop.printDetails();
			
			boolean update = laptop.updategammingByName("Linux", "Good");
			System.out.println("Update: "+update);
			laptop.printDetails();
			
			boolean delete = laptop.deleteByName("Windows");
			System.out.println("Delete: "+delete);
			laptop.printDetails();
		}
	}
