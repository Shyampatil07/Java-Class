package classandobject;

public class Hospitalcall {
	
	public static void main(String[] args) {
		
		 Hospital h = new Hospital();
		
		
		 System.out.println("----- Hospital Details -----");
	        System.out.println("Hospital Name: " + h.hospitalName);
	        System.out.println("Address: " + h.address);
	        System.out.println("City: " + h.city);
	        System.out.println("State: " + h.state);
	        System.out.println("Total Doctors: " + h.totalDoctors);
	        System.out.println("Total Nurses: " + h.totalNurses);
	        System.out.println("Total Beds: " + h.totalBeds);
	        System.out.println("Total Patients: " + h.totalPatients);
	        System.out.println("Specialization: " + h.specialization);
	        System.out.println("Director Name: " + h.directorName);
		
	}

}
