package day09_InterfacesPractice;

import java.util.Scanner;

public class Interface_Demo implements A,B,C,D,E,F,G,H,I,K,L,M,N,O,P,Q,R,S,T,U,X,Y,Z{
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int a = sc.nextInt();
//		float a = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int b = sc.nextInt();
//		float b = sc.nextInt();
		
		Interface_Demo s = new Interface_Demo();
		s.add(a, b);
		s.sub(a, b);
		s.multiply(a, b);
		s.mod(a, b);
		s.div(a, b);
		s.array();
		s.twoD();
		s.helloworld();
		s.threeD();
		s.star1();
		s.star2();
		s.evenodd();
		s.end1();
		s.asciiUpper();
		s.asciiLower();
		s.store();
		s.arrayindex();
		s.whileloop();
		s.end2();
		s.forloop();
		s.whileloop1();
		s.end3();
	}
	
	
		public void add(int a, int b) {
			int result = a+b;
			System.out.println("Addition is: "+result);
		}
	
	
		public void sub(int a, int b) {
		int result = a-b;
		System.out.println("Substraction is: "+result);
//		return sub;
		}
	
	
	public void myname() {
		String name = "Sohan Sirvi";
		System.out.println("My name is "+name);
//		return myname();
	}
	
	
	public void multiply(float a, float b) {
		float result = a * b;
		System.out.println("Multiplication of float is: "+result);
//		return a*b;
	}
	
	
	public void div(double a, double b) {
		double result = a/b;
		System.out.println("Division is: "+result);
//		return a/b;
	}
	
	
	public void mod(int a, int b) {
		int result = a%b;
		System.out.println("Mod is: "+result);
	}
	
	
	public void array() {
		int arr[] = {10,20,30,40,50};
		
		System.out.println("This numbers are present inside the array: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
				 
	}
	
	
	public void twoD() {
		int arr2[][]= {
				{1,2,3,4,5,6,7},
				{8,9,10,11,12,13,14}
		};
		
		System.out.println(arr2[1][3]);
	}
	
	
	public void helloworld() {
		System.out.println("HelloWorld From Sohan To Java Inheritance.");
	}
	
	
	public void threeD() {
		int arr3[][][] = {
				{
					{100,200,300,400},
					{500,600,700,800},
					{900,1000,1100,1200}
				}
		};
		System.out.println(arr3[0][2][3]);
	}
	
	
	public void star1() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	
	
	public void star2() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	
	
	public void evenodd() {
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.println("This is EVEN no: "+i);
			}
			else {
				System.out.println("This is ODD no: "+i);
			}
		}
	}
	
	
	public void end1() {
		System.out.println("This is the dead end of ClassO, it has no further childs/levels.");
	}
	
	
	public void asciiUpper() {
		for(char i='A'; i<='Z'; i++) {
			int j = i;
			System.out.print(i+" "+j+" ");
		}
	}
	
	
	public void asciiLower() {
		for(char i='a'; i<='z'; i++) {
			int j = i;
			System.out.print(i+" "+j+" ");
		}
	}
	
	
	public void store() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter product no: "+(i+1));
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Which product you want:");
		
		int prod = sc.nextInt();
		
		for(int i=0; i<size; i++) {
			if(arr[i]==prod) {
				System.out.println("Product is available");
			}
			else {
				System.out.println("Product is not available");
			}
		}
	}
	
	
	public void arrayindex() {
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
			System.out.print(n+",");
		}
	}
	
	
	public void whileloop() {
		int i = 0;
		do {
			System.out.println("Wel-Come");
			i++;
		}while(i>5);
	}
	
	
	public void end2() {
		System.out.println("This is the dead end of ClassU, it has no further childs/levels.");
	}
	
	
	public void forloop() {
		for(int i=0; i<=100; i++) {
			System.out.println(" "+i);
		}
	}
	
	
	public void whileloop1() {
		int i = 1;
		while(i<=10) {
			System.out.println(" "+i);
			i++;
		}
	}
	
	
	public void end3() {
		System.out.println("This is the dead end of ClassZ, it has no further childs/levels.");
	}
	
}

interface A {
	void add(int a, int b);
}

interface B {
	void sub(int a, int b);
}

interface C {
	void myname();
}

interface D {
	void multiply(float a, float b);
}

interface E {
	void div(double a, double b);
}

interface F {
	void mod(int a, int b);
}

interface G {
	void array();
}

interface H {
	void twoD();
}

interface I {
	void helloworld();
}

interface K {
	void threeD();
}

interface L {
	void star1();
}

interface M {
	void star2();
}

interface N {
	void evenodd();
}

interface O {
	void end1();
}

interface P {
	void asciiUpper();
}

interface Q {
	void asciiLower();
}

interface R {
	void store();
}

interface S {
	void arrayindex();
}

interface T {
	void whileloop();
}

interface U {
	void end2();
}

interface X {
	void forloop();
}

interface Y {
	void whileloop1();
}

interface Z {
	void end3();
}
