package programmingbatch;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		
		int a =0;
		int b=1;
		
//		  int curr =0;
//		  int next=0 ;
		
		
		for(int i=3;i<=10;i++) {
			int c =a+b ;
			System.out.print(" " + c);
			a=b;
			b=c;
			
//			curr = curr+a;
//			next = curr+b;
			
			
			
		}
		
	}

}
