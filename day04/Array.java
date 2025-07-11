package day04;

public class Array {
	public static void main(String[]args) {
		int arr1[] = {2,4,8,7,9,31,32,55,66};
		
		for(int i = 0; i<arr1.length; i++) {
			if(arr1[i]%2==0) {
				System.out.println("Index/Position:"+i +" Indexing:"+arr1[i]+" This is EVEN Number");
			}
			else {
				System.out.println("Index/Position:"+i +" Indexing:"+arr1[i]+" This is ODD Number");
			}
		}
		for(int n : arr1) {
			System.out.println(n);
		}
	}
}
