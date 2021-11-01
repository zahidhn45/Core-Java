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
		
		String text = null;
		do{
			System.out.println("press 1 to get all room details");
			System.out.println("Press 2 to update pg type name by pg room number");
			System.out.println("press 3 to delete account by room number");
			System.out.println("press 4 to get room type by room number");
			int choice = sc.nextInt();

			switch(choice){
				case 1:
					pg.printDetails();
					break;
				case 2:
					System.out.println("Enter Room number for which you want to update room type");
					int roomNo = sc.nextInt();
					System.out.println("Enter updated Room type");
					String type = sc.next();
					boolean update = pg.updatePgTypeByPgRoomNo(roomNo, type);
					System.out.println("Updated: "+update);
					break;
				case 3:
					System.out.println("Enter Room number for which you want an entry to be deleted");
					boolean delete = pg.deleteByRoomNumber(sc.nextInt());
					System.out.println("Deleted: "+delete);
					break;
				case 4:
					System.out.println("Enter room number");
					pg.getRoomTypeByRoomNumber(sc.nextInt());
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