
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library();
		
		library.addBook(1, "KNJIGA");
		library.addBook(2, "KNJIGA-2");
		library.addBook(3, "KNJIGA-3");
		
		for(Book book : Library.getAllBooks()) {
			System.out.println(book.toString());
		}
		
		System.out.println(Library.getAllBooks().size());
	}

}
