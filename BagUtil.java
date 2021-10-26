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
		
		bag.addBook(dto);
		bag.printDetails();
	}
}