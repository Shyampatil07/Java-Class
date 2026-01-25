package oopPractise;

import java.util.Scanner;
public class LibraryTest {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Book input
	        System.out.print("Enter Book ID: ");
	        int bid = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Book Title: ");
	        String title = sc.nextLine();

	        System.out.print("Enter Book Author: ");
	        String author = sc.nextLine();

	        Book book = new Book(bid, title, author);

	        // User input
	        System.out.print("\nEnter Student Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Student Age: ");
	        int age = sc.nextInt();

	        Child student = new Child(name, age, book);

	        Library library = new Librarymain();

	        library.issueBook();
	        student.showDetails();
	        library.returnBook();

	        sc.close();
	    }
}
