package day02;

import java.util.Scanner;

public class Conditional {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number:");
		
		int one = sc.nextInt();
		
		if(one%2==0) {
			System.out.println("The number is EVEN "+one);
		}
		else {
			System.out.println("The number is ODD "+one);
		}
	}
}
