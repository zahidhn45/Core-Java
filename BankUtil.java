import java.util.Scanner;
class BankUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Bank bank = new Bank(size);
		
		for(int i = 0; i < size; i++){
			AccountDTO dto = new AccountDTO();
		
			System.out.println("Enter Account id");
			dto.setAccountId(sc.nextInt());
			System.out.println("Enter Account Name");
			dto.setAccountName(sc.next());
			System.out.println("Enter Gender");
			dto.setGender(sc.next());
			System.out.println("Enter Phone Number");
			dto.setPhone(sc.nextLong());
			System.out.println("Enter Rate of Intrest");
			dto.setRateOfIntrest(sc.nextDouble());
			
			bank.addAccount(dto);
		}
		
		bank.printDetails();
		
		System.out.println("Enter Account id for which name is be updated");
		int id = sc.nextInt();
		System.out.println("Enter updated name");
		String name = sc.next();
		boolean update = bank.updateAccountNameByAccountId(name, id);
		System.out.println("Update: "+update);
		bank.printDetails();
		
		System.out.println("Enter id for which an entry is to be deleted");
		boolean delete = bank.deleteById(sc.nextInt());
		System.out.println("Delete: "+delete);
		bank.printDetails();
	}
}