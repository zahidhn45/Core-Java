import java.util.Scanner;
class PgUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Pg pg =  new Pg(size);
		RoomsDTO  dto =  new RoomsDTO();
		dto.setRoomNumber(123);
		dto.setRoomType("Double");
		dto.setNumberOfBed(4);
		dto.setCupboardAvailable(true);
		
		pg.addRoom(dto);
		pg.printDetails();
	}
	
}