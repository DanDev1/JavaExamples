package knowingjava;
import java.util.Scanner;
public class CheckInputString {
public static void main(String[] args) {
	String userString;
boolean check;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string: ");
	userString = scan.next();
	
	if (userString.equalsIgnoreCase("Red") || userString.equalsIgnoreCase("Blue") || userString.equalsIgnoreCase("Green") ) {
	System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}
	

}
}
