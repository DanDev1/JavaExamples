package knowingjava;
import java.util.Scanner;
public class Jeans {
public static void main(String[] args){
	float firstPrice;
	float secondPrice;
	float thirdPrice;
	float totalPrice;
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the price of the pair of jeans");
	System.out.println("Enter 1st price ");
	firstPrice = userInput.nextFloat();
	
	System.out.println("Enter 2nd price ");
	secondPrice = userInput.nextFloat();
	
	System.out.println("Enter 3rd price ");
	thirdPrice = userInput.nextFloat();
	
	totalPrice = firstPrice + secondPrice + thirdPrice;
	
	System.out.println("");
	System.out.println(firstPrice);
	System.out.println(secondPrice);
	System.out.println(thirdPrice);
	System.out.println("----");
	System.out.println(totalPrice);
	}
}
