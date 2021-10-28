import java.util.Scanner;
class PgUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		Pg pg =  new Pg(size);
		
		for(int i = 0; i< size; i++){
			RoomsDTO  dto =  new RoomsDTO();
			
			System.out.println("Enter Room number");
			dto.setRoomNumber(sc.nextInt());
			System.out.println("Enter Room Type");
			dto.setRoomType(sc.next());
			System.out.println("Enter number of bed in Room ");
			dto.setNumberOfBed(sc.nextInt());
			System.out.println("Enter cupboard available");
			dto.setCupboardAvailable(sc.nextBoolean());
			pg.addRoom(dto);
		}
		
		
		
		pg.printDetails();
		System.out.println("Enter Room number for which you want to update room type");
		int roomNo = sc.nextInt();
		System.out.println("Enter updated Room type");
		String type = sc.next();
		boolean update = pg.updatePgTypeByPgRoomNo(roomNo, type);
		System.out.println("Updated: "+update);
		pg.printDetails();
		
		System.out.println("Enter Room number for which you want an entry to be deleted");
		boolean delete = pg.deleteByRoomNumber(sc.nextInt());
		System.out.println("Deleted: "+delete);
		pg.printDetails();
		
	}
	
}