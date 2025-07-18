package day13;

import java.util.Scanner;

public class TryCatch2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter index no: ");
		
		int a = sc.nextInt();
		
		m1(a);
	}
	
	
	public static void m1(int a) {
		try {
			int arr1[] = {1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr1[a]+" --> This element is present on that index position");
		}
		catch(Exception e) {
			e.getMessage();
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
