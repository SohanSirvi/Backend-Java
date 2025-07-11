package day01;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[]args) {
		Scanner info = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		System.out.println("Enter Your Age:");
		System.out.println("Enter Your City:");
		
		
		String name = info.next();
		int age = info.nextInt();
		String city = info.next();
		
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("I live in "+city);
		
	}
}
  

