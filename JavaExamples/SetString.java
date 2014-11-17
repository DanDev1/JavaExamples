package knowingjava;
import java.util.Scanner;
public class SetString {
public static void main(String[] args) {
	String javaString = "This is a java string program";
	int javaStringLength;
	String javaStringChar;
	String letterCapitalizedString;
	//Scanner scan = new Scanner(System.in);
	//System.out.println("Enter first string: ");
	//firstString = scan.next();
	
	//System.out.println("Enter first string: ");
	//secondString = scan.next();
	javaStringLength = javaString.length();
	System.out.println(javaStringLength);
	
	javaStringChar = javaString.substring(9,11);
	System.out.println(javaStringChar);
	
	letterCapitalizedString = javaString.toUpperCase();
	System.out.println(letterCapitalizedString);
}
}
