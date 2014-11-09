package knowingjava;
import java.util.Scanner;
public class MenuItems {
	public static void main(String [] args)
	{
		int userChoice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(userChoice != 4) {
		System.out.println(" 1 = Open File");
		System.out.println(" 2 = Edit File");
		System.out.println(" 3 = Close File");
		System.out.println(" 4 = Exit");
		
		userChoice = scan.nextInt();
		
		switch (userChoice) {
		case 1:
			System.out.println(" File has been opened");
		break;
		case 2:
			System.out.println(" File has been edited");
		break;
		case 3:
			System.out.println(" File has been closed");
		break;
		case 4:
			System.out.println(" File has been exited");
		break;
		}
		
		}
	}
}
