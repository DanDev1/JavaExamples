package knowingjava;
import java.util.Scanner;

class SumTo {
	public static void main(String[] args) {
	int num;
	int total;
		Scanner scan = new Scanner(System.in);
	System.out.print("Enter your number ");
	num = scan.nextInt();
	for (int i = 1; i < num; i ++)
	{
		total = num + i;
		System.out.println(total+ " = " +i+ " + " +num);
	}
	
	}

}
