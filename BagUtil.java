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
		
		bag.printDetails();
		
		System.out.println("Enter the id for which you want to update the book name");
		int id = sc.nextInt();
		System.out.println("Enter the updated name");
		String name = sc.next();
		boolean update = bag.updateBookNameByBookId(name, id);
		System.out.println("Updated: "+update);
		bag.printDetails();
		
		System.out.println("Enter the id for which you wnat to delete an entry");
		boolean delete = bag.deleteById(sc.nextInt());
		System.out.println("Deleted: "+delete);
		bag.printDetails();
	}
}