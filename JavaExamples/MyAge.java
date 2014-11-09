package knowingjava;

import java.util.Scanner;

public class MyAge {
	
	public static void main(String[] args) {
		int age;
		Scanner answer = new Scanner(System.in);
		
		System.out.println("What is your age? ");
		
		age = answer.nextInt();
		System.out.print("Your age is " +age);
	}

}
