public class BookDTO{
	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookType;
	

	
	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	public int getBookId(){
		return bookId;
	}
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getBookName(){
		return bookName;
	}
	public void setBookPrice(double bookPrice){
		this.bookPrice = bookPrice;
	}
	public double getBookPrice(){
		return bookPrice;
	}
	public void setBookType(String bookType){
		this.bookType = bookType;
	}
	public String getBookType(){
		return bookType;
	}
}
