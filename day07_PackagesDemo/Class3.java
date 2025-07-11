package day07_PackagesDemo;

public class Class3 {
	public void myname() {
//		for(char i='A'; i<='Z'; i++) {
//			int s = i;
//			System.out.println(i+" "+s+" ");
//		}
		
		char[] name = {83,79,72,65,78};
		
		System.out.print("My name is:");
		
		for(char n : name) {
			System.out.print(n);
		}
		
	}
}
