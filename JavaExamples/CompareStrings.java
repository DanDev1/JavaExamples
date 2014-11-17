package knowingjava;
import java.util.Scanner;
public class CompareStrings {
public static void main(String[] args) {
	String firstString;
	String secondString;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first string: ");
	firstString = scan.next();
	
	System.out.println("Enter first string: ");
	secondString = scan.next();
	
	if (firstString.equals(secondString)) {
		System.out.println("Strings are equal");
	} else {
		System.out.println("Strings are not equal");
	}
}
}
