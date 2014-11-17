package knowingjava;
import java.util.Scanner;
public class CheckInputString2 {
public static void main(String[] args) {
	String userString;
boolean check;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string: ");
	userString = scan.next();
	
	switch (userString) {
	case "red":
		System.out.println("Pass");
		break;
	case "blue":
		System.out.println("Pass");
		break;
	case "green":
		System.out.println("Pass");
		break;
	default:
		System.out.println("Fail");
		break;	
	}
}}
