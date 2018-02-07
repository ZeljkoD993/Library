import java.util.Scanner;

public class Main extends Library{
	static Scanner unos = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library();
		
		while(true) {
		int korisnikovUnos;
		System.out.println("-------------------");
		System.out.println("Choose one of number");
		System.out.println("1. Add user");
		System.out.println("2. Add book");
		System.out.println("3. Rent book");
		System.out.println("4. Return book");
		System.out.println("5. Show all book");
		System.out.println("6. Show all users");
		System.out.println("7. Exit");
		System.out.println("-------------------");
		
		korisnikovUnos = unos.nextInt();
		
		switch (korisnikovUnos) {
		case 1:
			String ime;
			int id;
			System.out.println("Add user");
			System.out.println("-------------------");
			System.out.println("Enter id");
			id = unos.nextInt();
			unos.nextLine();
			System.out.println("Enter user name");
			ime = unos.nextLine();
			
			
			if(Check.isUserIdValid(id) && Check.isUserIdTaken(Library.getAllUsers(), id)) {
				library.addUser(id, ime);
			}
		
			break;
		
		case 2:
			
			String imeKnjige = null;
			int idKnjige = 0;
			System.out.println("Add book");
			System.out.println("-------------------");
			System.out.println("Enter id");
			idKnjige = unos.nextInt();
			unos.nextLine();
			System.out.println("Enter book name");
			imeKnjige = unos.nextLine();
			
			
			if(Check.isBookIdValid(idKnjige) && !Check.isBookExists(Library.getAllBooks(), idKnjige)) {
				library.addBook(idKnjige, imeKnjige);
			}
			else System.out.println("Knjiga nije uspjela da se doda");
		
			
			break;
		
		case 3:
			
			int idKnjiga, idKorisnik;
			
			System.out.println("Enter id knjige");
			idKnjiga = unos.nextInt();
			
			System.out.println("Enter id korisnika");
			idKorisnik = unos.nextInt();
			
			library.rentBook(idKorisnik, idKnjiga);
			
			
			break;
		case 6:
			
			for(Book book: Library.getAllBooks()) {
				System.out.println(book.toString());
			}
			
			
			
			break;
			
		default:
			break;
		}
	}
		
	}

}
