package knowingjava;
import java.util.Scanner;
public class ChangeCase {
public static void main(String[] args) {
	String lastName = null;

	Scanner scan = new Scanner(System.in);
	System.out.println("What is your last name in lower case: ");
	lastName = scan.next();

	StringBuilder sb = new StringBuilder(lastName); // one StringBuilder object  
	sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));  

	System.out.println(sb);
}
}
