import java.util.Scanner;
class BagUtil{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Bag bag = new Bag(size);
		BookDTO dto = new BookDTO();
		dto.setBookId(15);
		dto.setBookName("JAVA");
		dto.setBookPrice(750.00);
		dto.setBookType("Programming");
		
		BookDTO dto1 = new BookDTO();
		dto1.setBookId(156);
		dto1.setBookName("PYTHON");
		dto1.setBookPrice(7550.00);
		dto1.setBookType("Programming");
		
		bag.addBook(dto);
		bag.addBook(dto1);
		
		bag.printDetails();
		
		boolean update = bag.updateBookNameByBookId("UNIX", 15);
		System.out.println("Updated: "+update);
		bag.printDetails();
		
		boolean delete = bag.deleteById(156);
		System.out.println("Deleted: "+delete);
		bag.printDetails();
	}
}