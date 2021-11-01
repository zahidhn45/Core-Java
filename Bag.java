class Bag{
	BookDTO[] book;
	int index;
	
	public Bag(int size){
		book  =  new BookDTO[size];
	}
	public boolean addBook(BookDTO  book){
		boolean  isAdded = false;
		System.out.println("Inside addBook()");
		if(book != null){
			System.out.println("Adding Book");
			this.book[index++] =  book;
			isAdded = true;
		}
		else{
			System.out.println("Cannot add book");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i = 0; i<book.length;  i++){
			if(book[i] != null){
				System.out.println(book[i].getBookId()+ ", "+book[i].getBookName()+  ", "+book[i].getBookPrice()+ ", "+book[i].getBookType());
			}
		}
	}
	public boolean updateBookNameByBookId(String name, int id){
		System.out.println("Inside updateBookNameByBookId()");
		boolean isUpdated  = false;
		for(int i = 0; i < book.length; i++){
			if(book[i] != null){
				if(book[i].getBookId() == id){
					book[i].setBookName(name);
					isUpdated =  true;
				}
			}
		}
		return isUpdated;
	}
	public boolean deleteById(int id){
		System.out.println("Inside deleteById");
		boolean isDeleted = false;
		for(int i = 0; i< book.length; i++){
			if(book[i] != null){
				if(book[i].getBookId() == id){
					book[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	public BookDTO getBookNameByBookId(int id) {
		System.out.println("Inside getBookNameByBookId() ");
		BookDTO dto = null;
		for (int i = 0; i < book.length; i++) {
			if(id > 0){
				if(book[i].getBookId() == id){
					dto = book[i];
				} else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
}