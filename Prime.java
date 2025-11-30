package programmingbatch;

public class Prime {

	public static void main(String[] args) {
		boolean isPrime = false;
		int num = 9;
		for (int i = 1; i <= 9; i++) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}
		if (isPrime = true) {
			System.out.println(num + " is not Prime");
		} else {
			System.out.println(num + " is Prime");
		}

	}

}
