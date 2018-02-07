import java.util.ArrayList;

public class Check {
	
	public static boolean isUserIdValid(int userID) {
		if(userID < 0) {
			System.out.println("User is not valid");
			return false;
		}
		else
		return true;
	}
	
	public static boolean isUserIdTaken(ArrayList<User> userdb, int userID) {
		for(User user : userdb) {
			if(user.getUserID() == userID) {
				System.out.println("User alredady eists");
				return false;
			}else
				return true;
				
		}
		return false;
	}
	
	public static boolean isNumOfBookOverLimit(ArrayList<User>userdb, int userID) {
		for(User user : userdb) {
			if(user.getUserID() == userID) {
				if(Library.getNumOfBooksTaken()>3) {
					System.out.println("Users books is overlimit");
					return false;
				} else
					return true;
			}
		}
		return false;
	}
	
	public static boolean isBookIdValid(int bookID) {
		if(bookID < 0) {
			System.out.println("BookID is not valid");
			return false;
		}else
		return true;
		
	}
	
	public static boolean isBookTaken(ArrayList<Book> booksTaken, int bookID) {
		if(booksTaken.contains(new Book(bookID, " "))) {
			System.out.println(" Book is taken ");
			return false;
		}
		else 
			return true;
	}
	
	public static boolean isBookExists(ArrayList<Book> bookdb, int bookID) {
		for(Book book : bookdb) {
			if(book.getBookID() == bookID) {
				System.out.println("Book already exists");
				return true;
			}
		}
		return false;
	}
	
}
