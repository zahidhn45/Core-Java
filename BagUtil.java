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
			System.out.println("press 4 to get book details by book id");
			System.out.println("press 5 to get book details by book name");
			System.out.println("press 6 to get book details by book price");
			System.out.println("press 7 to get book details by book type");
			System.out.println("press 8 to get book name by book price");
			System.out.println("press 9 to get book type by book name");
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
					BookDTO dto = bag.getBookDetailsByBookId(sc.nextInt());
					if(dto != null){
						System.out.println(dto.getBookId()+" "+dto.getBookName()+" "+dto.getBookPrice()+" "+dto.getBookType());
					}
					break;
				case 5:
					System.out.println("Enter book name");
					BookDTO dto1 = bag.getBookDetailsByBookName(sc.next());
					if(dto1 != null){
						System.out.println(dto1.getBookId()+" "+dto1.getBookName()+" "+dto1.getBookPrice()+" "+dto1.getBookType());
					}
					break;
				case 6:
					System.out.println("Enter book price");
					BookDTO dto2 = bag.getBookDetailsByBookPrice(sc.nextDouble());
					if(dto2 != null){
						System.out.println(dto2.getBookId()+" "+dto2.getBookName()+" "+dto2.getBookPrice()+" "+dto2.getBookType());
					}
					break;
				case 7:
					System.out.println("Enter book type");
					BookDTO dto3 = bag.getBookDetailsByBookType(sc.next());
					if(dto3 != null){
						System.out.println(dto3.getBookId()+" "+dto3.getBookName()+" "+dto3.getBookPrice()+" "+dto3.getBookType());
					}
					break;
				case 8:
					System.out.println("Enter book price");
					System.out.println(bag.getBookNameByAppPrice(sc.nextDouble()));
					break;
				case 9:
					System.out.println("Enter book name");
					System.out.println(bag.getBookTypeByBookName(sc.next()));
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