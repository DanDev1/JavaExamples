package knowingjava;

public class TernaryOperator2 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		String answer;
		
/*		if (a < b && c > b ) {
			System.out.println("it's true");
		}
		else {
			System.out.println("its false");
		}
*/
		answer = ((a < b) && (c > b))?"it's true":"its false";
		
		System.out.println(answer);
		

		
	}

}
