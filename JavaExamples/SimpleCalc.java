package knowingjava;
import java.util.Scanner;
public class SimpleCalc {
	public static void main(String [] args)
	{
		float num1 = 0;
		float num2 = 0;
		float answer = 0;
		int userChoice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(userChoice != 4) {
		System.out.println("Enter 1st number ");
		num1 = scan.nextFloat();
		
		System.out.println("Enter 2nd number ");
		num2 = scan.nextFloat();
		
		System.out.println(" 1 = Add");
		System.out.println(" 2 = Subtract");
		System.out.println(" 3 = Divide");
		System.out.println(" 4 = Multiply");
		System.out.println(" 5 = Exit");
		
		userChoice = scan.nextInt();
		
		switch (userChoice) {
		case 1:
			answer = num1 + num2;
			System.out.println(answer+ " = " +num1 +" + " +num2);
		break;
		case 2:
			answer = num1 - num2;
			System.out.println(answer+ " = " +num1 +" - " +num2);
		break;
		case 3:
			answer = num1 / num2;
			System.out.println(answer+ " = " +num1 +" / " +num2);
		break;
		case 4:
			answer = num1 * num2;
			System.out.println(answer+ " = " +num1 +" * " +num2);
		break;
		case 5:
			System.out.println("Exit");
		break;
		}
		
		}
	}
}
