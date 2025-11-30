package programmingbatch.main;

public class Main {
	
	public void prime(int num) {
		
	boolean isPrime = false;
	for (int i = 2; i <= 9; i++) {
		if (num % i == 0) {
			isPrime = true;
			break;
		}
	}
	if (isPrime == true) {
		System.out.println(num + " is not Prime");
	} else {
		System.out.println(num + " is Prime");
	}
	}
	
	public void reverse(int num) {
		int rev=0;
		while (num != 0) {
            rev = rev * 10 + num % 10;  
            num = num / 10;            
        }
		 
		 System.out.println("Reversed Number: " + rev);
	}
	
	
	public void fibonacci(int num) {
		
		int a =0;
		int b=1;
		
		for(int i=3;i<=num;i++) {
			int c =a+b ;
			System.out.print(" " + c);
			a=b;
			b=c;
		}
	}

}
