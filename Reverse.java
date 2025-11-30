package programmingbatch;

public class Reverse {
	
	public static void main(String[] args) {
		
//		int num=9874;
//		
//		int rev=0;
//		while (num != 0) {
//            rev = rev * 10 + num % 10;  
//            num = num / 10;            
//        }
//		 
//		 System.out.println("Reversed Number: " + rev);
		
//		int num=9874;
//		int rev=0;
//		
//		for(int i=1; i<=4;i++) {
//			rev = rev * 10 + num % 10;  
//          num = num / 10;
//		}
//		 System.out.println("Reversed Number: " + rev);
		
//		String name="Shyam";
//		String rev="";
//		
//		 for (int i = name.length() - 1; i >= 0; i--) {
//	           
//	        }
//
//	        System.out.println("Reversed String: " + rev);
//		
		String name="Shyam";
		String rev="";
		
		int i = name.length() - 1;
		
		while(i >= 0) {
			 rev = rev + name.charAt(i);
			 i--;
		}
		 System.out.println("Reversed String: " + rev);
	}

}
