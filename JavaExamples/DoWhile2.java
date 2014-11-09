package knowingjava;
import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args)
	{
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter Your Number");
			num = scan.nextInt();
		} while (num != 8);
		
		
	}
}
