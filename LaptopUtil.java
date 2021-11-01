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
			
			
			laptop.printDetails();
			
			System.out.println("Enter os name for which gamming Exprerience is to be updated");
			String name = sc.next();
			System.out.println("Enter the updated os Gamming Experience");
			String exp = sc.next();
			boolean update = laptop.updategammingByName(name, exp);
			System.out.println("Update: "+update);
			laptop.printDetails();
			
			System.out.println("Enter os name for which en entry has to be deleted");
			boolean delete = laptop.deleteByName(sc.next());
			System.out.println("Delete: "+delete);
			laptop.printDetails();
		}
	}
