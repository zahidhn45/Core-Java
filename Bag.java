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
			System.out.println(book[i].getBookId()+ ", "+book[i].getBookName()+  ", "+book[i].getBookPrice()+ ", "+book[i].getBookType());
		}
	}
}