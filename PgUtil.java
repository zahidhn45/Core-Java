import java.util.Scanner;
class PgUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Pg pg =  new Pg(size);
		RoomsDTO  dto =  new RoomsDTO();
		RoomsDTO  dto1 =  new RoomsDTO();
		
		dto.setRoomNumber(123);
		dto.setRoomType("Double");
		dto.setNumberOfBed(4);
		dto.setCupboardAvailable(true);
		
		dto1.setRoomNumber(456);
		dto1.setRoomType("single");
		dto1.setNumberOfBed(2);
		dto1.setCupboardAvailable(true);
		
		pg.addRoom(dto);
		pg.addRoom(dto1);
		pg.printDetails();
		
		boolean update = pg.updatePgTypeByPgRoomNo(123, "single");
		System.out.println("Updated: "+update);
		pg.printDetails();
		
		boolean delete = pg.deleteByRoomNumber(456);
		System.out.println("Deleted: "+delete);
		pg.printDetails();
		
	}
	
}