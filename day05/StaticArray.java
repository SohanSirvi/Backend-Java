package day05;

import java.util.Scanner;

public class StaticArray {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array from no: 0 to 9");
		
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Array Index "+i);
			
			arr1[i] = sc.nextInt();
		}
		
//		System.out.println("These are the EVEN and POSITIVE numbers in this array:");
		
		for(int i=0; i<size; i++) {
			if(arr1[i]>0 && arr1[i]%2==0) {
				System.out.println("EVEN and POSITIVE Number: "+arr1[i]);
			}
			else {
				System.out.println("ODD and NEGATIVE Number: "+arr1[i]);
			}
			
	}
}}
