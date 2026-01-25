package oopPractise;

public class Librarymain extends Library {

	@Override
	void issueBook() {
		// TODO Auto-generated method stub
		 System.out.println("Book issued successfully.");
	}

	@Override
	void returnBook() {
		// TODO Auto-generated method stub
		 System.out.println("Book returned.");
	        System.out.println("Late Fee: ₹" + LATE_FEE);
	}

}
