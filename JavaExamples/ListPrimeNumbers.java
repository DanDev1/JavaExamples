package knowingjava;
import java.util.Scanner;

public class ListPrimeNumbers {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int primeNum = 0;
		
		// Enter number 15
		System.out.println("Enter number ");
		num = scan.nextInt();
		
		// 7.5 = 15 % 2
		primeNum = 2 % num;
		if (primeNum > 0);
		{
			System.out.println(num+" is prime");
		}
		
		
		for (int i = 1; i > num; i ++) {
			//for (int j = num; j < num; j ++) {
	

			
			//}
		}
		/*for (int i2 = 1; i < 1; i ++) {
			
		
			System.out.println()
		}
		*/
	}

}
