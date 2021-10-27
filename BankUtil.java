import java.util.Scanner;
class BankUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Bank bank = new Bank(size);
		AccountDTO dto = new AccountDTO();
		AccountDTO dto1 = new AccountDTO();
		
		dto.setAccountId(1254);
		dto.setAccountName("Mukesh");
		dto.setGender("Male");
		dto.setPhone(1245689756L);
		dto.setRateOfIntrest(8.5);
		
		dto1.setAccountId(4563);
		dto1.setAccountName("Rohima");
		dto1.setGender("female");
		dto1.setPhone(1245689756L);
		dto1.setRateOfIntrest(8.5);
		
		bank.addAccount(dto);
		bank.addAccount(dto1);
		bank.printDetails();
		
		boolean update = bank.updateAccountNameByAccountId("Rakesh", 1254);
		System.out.println("Update: "+update);
		bank.printDetails();
		
		boolean delete = bank.deleteById(4563);
		System.out.println("Delete: "+delete);
		bank.printDetails();
	}
}