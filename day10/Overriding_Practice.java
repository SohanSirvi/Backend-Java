package day10;

import java.util.Scanner;

public class Overriding_Practice {
	public static void s1(int a, int b) {
		int result = a-b;
		System.out.println("Substraction is: "+result);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int b = sc.nextInt();
		
		sc.close();
		
		Overriding_Practice.s1(a,b);
		Overriding_Demo1.s1(a, b);
		
		
		
		
	}
	
	
}

class Overriding_Demo1 {
	public static void s1(int a, int b) {
		int result = a%b;
		System.out.println("Mod is: "+result);
	}
}
