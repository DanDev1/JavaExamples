package knowingjava;
import java.util.Scanner;
public class ReplaceVowels {
public static void main(String[] args) {
	String city;
	String cityVowelsReplaced;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a city: ");
	city = scan.next();
	
	cityVowelsReplaced = city.replace("a", "z").replace("e", "y").replace("i", "x").replace("o", "w").replace("u", "t");
	
	System.out.println(cityVowelsReplaced);
}
}
