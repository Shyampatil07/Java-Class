package classandobject;

public class Librarycall {
	
	public static void main(String[] args) {
		
		  Library lib = new Library();
		  
		  System.out.println("----- Library Details -----");
	        System.out.println("Library Name: " + lib.Name);
	        System.out.println("Address: " + lib.address);
	        System.out.println("Total Books: " + lib.totalBooks);
	        System.out.println("Total Members: " + lib.totalMembers);
	        System.out.println("Librarian Name: " + lib.librarianName);
		
	}

}
