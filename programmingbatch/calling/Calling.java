package programmingbatch.calling;

import programmingbatch.main.Main;

public class Calling {
	
	public static void main(String[] args) {
		Main pri = new Main();
		
		pri.prime(89);
		
		Main rev = new Main();
		rev.reverse(9876);
		
		Main fib = new Main();
		fib.fibonacci(10);
	}

}
