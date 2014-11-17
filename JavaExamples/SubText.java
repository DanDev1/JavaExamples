package knowingjava;
import java.util.Scanner;
public class SubText {
public static void main(String[] args) {
	String liverpool;
	String liver;
	String pool;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter liverpool: ");
	liverpool = scan.next();
	
	liver = liverpool.substring(0, 5);
	pool = liverpool.substring(5, 9);
	
	System.out.println("I lost my "+liver+" in a "+pool+".");
}
}
