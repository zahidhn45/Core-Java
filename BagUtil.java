import java.util.Scanner;
class BagUtil{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Bag bag = new Bag(size);
		
		for(int i = 0; i < size; i++){
			BookDTO dto = new BookDTO();
			
			System.out.println("Enter the book id");
			dto.setBookId(sc.nextInt());
			System.out.println("Enter the book name");
			dto.setBookName(sc.next());
			System.out.println("Enter the book price");
			dto.setBookPrice(sc.nextDouble());
			System.out.println("Enter the book type");
			dto.setBookType(sc.next());

			bag.addBook(dto);
		}
		String text = null;
		do{
			System.out.println("press 1 to get all books details");
			System.out.println("Press 2 to update book name by id");
			System.out.println("press 3 to delete book by id");
			System.out.println("press 4 to get book name by account id");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					bag.printDetails();
					break;
				case 2:
					System.out.println("Enter the id for which you want to update the book name");
					int id = sc.nextInt();
					System.out.println("Enter the updated name");
					String name = sc.next();
					boolean update = bag.updateBookNameByBookId(name, id);
					System.out.println("Updated: "+update);
					break;
				case 3:
					System.out.println("Enter the id for which you wnat to delete an entry");
					boolean delete = bag.deleteById(sc.nextInt());
					System.out.println("Deleted: "+delete);
					break;
				case 4:
					System.out.println("Enter id");
					bag.getBookNameByBookId(sc.nextInt());
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