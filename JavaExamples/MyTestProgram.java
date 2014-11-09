package knowingjava;
import java.util.Scanner;

public class MyTestProgram {
	
	public static void main(String[] args) {
		int primeLimit = 0;
		int total = 0;
		int numberOfPrimeFound = 1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please the limit to which you want calculate Prime Numbers ");
		primeLimit = scan.nextInt();
		
		for (int i = primeLimit; i > 2; i--) {
			
		total = i % 2;
		
			if (total == 1) {
				
			System.out.println(i+ " is a prime number, " +numberOfPrimeFound+ " Prime numbers found");
			numberOfPrimeFound ++;
			}
			else {
				System.out.println(i+ " is a NOT prime number");
			}
		
		}
	}
}
