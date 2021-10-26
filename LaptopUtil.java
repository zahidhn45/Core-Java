import java.util.Scanner;
class LaptopUtil{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
			System.out.println("Enter size");
			int size = sc.nextInt();
			
			Laptop laptop = new Laptop(size);
			OsDTO os = new OsDTO();
			os.setOsName("Windows");
			os.setOsSize(10);
			os.setGammingExperience("Nice");
			
			laptop.addOs(os);
			laptop.printDetails();
		}
	}
