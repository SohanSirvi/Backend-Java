package day13;

import java.util.Scanner;

public class TryCatch3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter 1st no: ");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter 2nd no: ");
//		int b = sc.nextInt();
//		
//		Division z = new Division();
//		z.div(a,b);
		
	
		try {
			System.out.println("Enter a value: ");
			int a1 = sc.nextInt();
			System.out.println("Entered value is:" +a1);
		}
		catch(Exception e){
//			e.getMessage();
//			e.printStackTrace();
			System.out.println("InputMismatchException "+e.getMessage());
		}
	}
	
	
}


class Division{
	public void div(int a, int b) {
		try {
			int result = a/b;
			System.out.println("Division is: "+result);
		}
		catch(Exception e){
//			e.getMessage();
//			e.printStackTrace();
			System.out.println("ArithmeticException"+e.getMessage());
		}
	}
}






