import java.util.ArrayList;

public class Library {
	
	private static ArrayList<Book> bookdb = new ArrayList<>();
	public static ArrayList<User> userdb = new ArrayList<>();
	private static ArrayList<Book> booksTaken = new ArrayList<>();
	
	public static int getNumOfBooksTaken() {
		return booksTaken.size();
	}
		

	public void addBook(int bookID, String bookName) {
		if(Check.isBookIdValid(bookID)== true) {
			bookdb.add(new Book(bookID, bookName));
		}
	}
	

	public void addUser(int userID, String userName) {
		if(Check.isUserIdValid(userID)== true) {
			userdb.add(new User(userID, userName));
		}
	}
	
	public void rentBook(int userID, int bookID) {
		if(Check.isBookTaken(booksTaken, bookID) && Check.isNumOfBookOverLimit(userdb, userID)== true)  {
			
			booksTaken.add(new Book(bookID, " "));
	}
}
	
	public void returnBook (int userID, int bookID) {
		if(Check.isBookTaken(booksTaken, bookID) == true) {
			booksTaken.remove(new Book(bookID, ""));
		}
	}
	
	public static  ArrayList<User> getAllUsers () {
		return userdb;
	}
	
	public static ArrayList<Book> getAllBooks(){
		return bookdb;
	}


}
