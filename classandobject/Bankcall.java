package classandobject;

public class Bankcall {
	
	public static void main(String[] args) {
		
		
		 Bank b = new Bank();
		
		 System.out.println("----- Bank Details -----");
	        System.out.println("Bank Name: " + b.bankName);
	        System.out.println("Branch Name: " + b.branchName);
	        System.out.println("IFSC Code: " + b.ifscCode);
	        System.out.println("Address: " + b.address);
	        System.out.println("Manager Name: " + b.managerName);
	        System.out.println("Total Employees: " + b.totalEmployees);
	        System.out.println("Total Accounts: " + b.totalAccounts);
	        System.out.println("Total Deposits: ₹" + b.totalDeposits);
	        System.out.println("Total Loans: ₹" + b.totalLoans);
	        System.out.println("Established Year: " + b.establishedYear);
	}

}
