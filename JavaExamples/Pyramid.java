package knowingjava;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {

		int depthOfPyramid = 0;	// Number you want to start with
		int incrementBy = 0; // Number you want to increment by
		
		Scanner scan = new Scanner(System.in);
		
		// ask for numbers
		
		System.out.print("Enter Depth of Pyramid ");
		depthOfPyramid = scan.nextInt();
		
	System.out.print("Enter Increment Number ");
	incrementBy = scan.nextInt();
	
	int blockNumber = 0; // Stores each 'block'
		
		for (int counter = 0; counter < depthOfPyramid; counter ++)
		{
			for (int counter1 = 1; counter1 <= counter; counter1 ++)
			{

				System.out.print(blockNumber +"\t");
				blockNumber = blockNumber + incrementBy;
			}
			System.out.print("");
		}
		
		
	}

}
