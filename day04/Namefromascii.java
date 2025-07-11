package day04;

public class Namefromascii {
	public static void main(String[]args) {
//		for(char i='A';i<='Z';i++) {
//			int i1=i;
//			System.out.print(" "+i+" "+i1);
//		}
		char[] arr1 = {83,79,72,65,78};
		
		char[] name = arr1;
		
		for(char n : name) {
			System.out.print(n);
		}
		
		
	}
}
