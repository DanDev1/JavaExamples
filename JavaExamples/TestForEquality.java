package knowingjava;
import java.util.Scanner;
public class TestForEquality {
public static void main(String[] args) {
	String s1 = "Apple";
	String s2 = "Apple";
/*
	if (s1 == s2) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}
	*/
	if (s1.equals(s2)) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}
	
}}
