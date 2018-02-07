
public class Book {
	
	private int bookID;
	private String bookName;
	private boolean isTaken;
	
	public Book(int bookID, String bookName) {
		this.bookID = bookID;
		this.bookName = bookName;
	}

	public int getBookID() {
		return bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void isTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
	
	@Override
	public String toString() {
		
		
		return "ID " + bookID + " Book name " + bookName + " book taken: " + isTaken;
	}
	
	

}
