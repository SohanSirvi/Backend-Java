package day16;

import java.util.Scanner;

public class Dynamic_Input extends Thread{
	public void d1(int a, int b) {	
		int result = a*b;
		System.out.println("Multiplication is: "+result);
	}
	
	public void d2(int marks) {
//		int marks = 0;
		if(marks >= 90) {
			System.out.println("You got A grade with "+marks+" marks");
		}
		else if(marks >= 80) {
			System.out.println("You got B grade with "+marks+" marks");
		}
		else if(marks >= 60) {
			System.out.println("You got C grade with "+marks+" marks");
		}
		else if(marks >= 35) {
			System.out.println("You got D grade with "+marks+" marks");
		}
		else {
			System.out.println("You are Failed!!");
		}
		
	}
	
	public void run() {
		int result = 50-20;
		System.out.println("Substraction is: "+result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st no: ");
//		int a = sc.nextInt();
//		System.out.println("Enter 2nd no: ");
//		int b = sc.nextInt();
		
//		System.out.println("Enter your marks: ");
//		int marks = sc.nextInt();
		
		Dynamic_Input d = new Dynamic_Input();
//		d.d1(a, b);
//		d.d2(marks);
		d.start();
	}
}
