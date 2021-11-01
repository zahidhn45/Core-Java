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

		String text = null;

		do{
			System.out.println("press 1 to get all account details");
			System.out.println("Press 2 to update account name by id");
			System.out.println("press 3 to delete account by id");
			System.out.println("press 4 to get account name by account id");

			int choice = sc.nextInt();
			switch(choice){
				case 1:
					bank.printDetails();
					break;
				case 2:
					System.out.println("Enter Account id for which name is be updated");
					int id = sc.nextInt();
					System.out.println("Enter updated name");
					String name = sc.next();
					boolean update = bank.updateAccountNameByAccountId(name, id);
					System.out.println("Update: "+update);
					break;
				case 3:
					System.out.println("Enter id for which an entry is to be deleted");
					boolean delete = bank.deleteById(sc.nextInt());
					System.out.println("Delete: "+delete);
					break;
				case 4:
					System.out.println("Enter id");
					bank.getAccountNameByAccountId(sc.nextInt());
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