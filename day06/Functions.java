package day06;

public class Functions {
	
	public static void evenodd() {
		
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.println("EVEN No:- "+i);
			}
			else {
				System.out.println("ODD No:- "+i);
			}
		}
	}
	
	public static void array() 
	{
		int arr[] = new int[5];
		arr[0] = 33;
		arr[1] = 8;
		arr[2] = 27;
		arr[3] = 3;
		arr[4] = 39;
		
		System.out.println(arr);
		
	}
	
	public static void addition(int a, int b) {
		int add = a+b;
		System.out.println("Addition is: "+add);
	}
	
	public static int substraction(int a, int b) {
		return a-b;
	}
	
	public static void multiplication() {
		int result = 96 * 33;
		System.out.println("Multiplication is: "+result);
	}
	
	public static void TwoD() {
		int arr[][] = {
				{10,20,30,40},
				{40,90,20,10}
		};
		
		System.out.println(arr[0][3]);
	}
	
	public static void starpattern() {
		for(int i=1; i<=5; i++) 
	       {	
				for(int j=1; j<=i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}
	
	public static void ascii() {
		for(char i='A'; i <='Z'; i++ ) {
			int s =  i;
			System.out.print(i+" " +s +"  ");
		}
		System.out.println("");
		for(char i='a'; i <='z'; i++ ) {
			int s =  i;
			System.out.print(i+" " +s +"  ");
		}
	}
	
	public static void main(String[]args) {
//		evenodd();
//		array();
//		addition(10,33);
//		substraction(96,69);
//		multiplication();
//		TwoD();
//		starpattern();
		ascii();
		
	}
}
