package knowingjava;
import java.util.Scanner;
public class Maximum {
	public static void main(String[] args) {

		int num = 0;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number ");
		num = scan.nextInt();
		
		if (num >= 200 && num <= 500) {
		
			for (int counter = 100; counter < num; counter ++) {
				
			total = counter + num;
			System.out.println(total+ " = " +counter+ " + " +num);

		}
	
		}
	}

}
