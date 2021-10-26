import java.util.Scanner;
class BankUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Bank bank = new Bank(size);
		
		AccountDTO dto = new AccountDTO();
		dto.setAccountId(1254);
		dto.setAccountName("Mukesh");
		dto.setGender("Male");
		dto.setPhone(1245689756L);
		dto.setRateOfIntrest(8.5);
		
		bank.addAccount(dto);
		bank.printDetails();
	}
}