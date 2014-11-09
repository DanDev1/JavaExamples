package knowingjava;
import java.util.Scanner;
public class MyStats {
	public static void main(String[] args)
	{
		byte age;
		short height;
		short weight;
		boolean bankAccount;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your age ");
		age = userInput.nextByte();
		
		System.out.println("What is your height ");
		height = userInput.nextShort();
		
		System.out.println("What is your weight ");
		weight = userInput.nextShort();
		
		System.out.println("Do you have a Bank Account - true or false");
		bankAccount = userInput.nextBoolean();
		
		System.out.println("Your age is "+age);
		System.out.println("Your height is "+height);
		System.out.println("Your weight is "+weight);
		System.out.println("Do you have a Bank Account "+bankAccount);
	}
	
}
