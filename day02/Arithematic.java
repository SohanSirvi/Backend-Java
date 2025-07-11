package day02;

import java.util.Scanner;

public class Arithematic {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		int addition = one+two;
		int substraction = one-two;
		int multiply = one*two;
		int division = one/two;
		int mod = one%two;
		
		
		System.out.println("Addition is: "+addition);
		System.out.println("Substraction is: "+substraction);
		System.out.println("Multiplication is: "+multiply);
		System.out.println("Division is: "+division);
		System.out.println("Mod is: "+mod);

	}
}
