package day16;

public class Threading_Demo extends Thread {
	
	public void t1() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("*This are example of Multiple Threading*");
		System.out.println();
		for(int a : arr) {
			try {
				Thread.sleep(1500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Thread 1 elements: "+a);
		}	
	}
	
	public void t2() {
		String arr[] = {"S","O","H","A","N"};
		for(String a : arr) {
			try {
				Thread.sleep(1500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("Thread 2 elements: "+a);
		}		
	}
	
	Threading_Demo(int a, int b){
		int result = a+b;
		System.out.println("This is example of Constructor");
		System.out.println("Addition is: "+result);
		System.out.println();
	}
	
	public static void main(String[]args) {
		Threading_Demo t = new Threading_Demo(33,67);
		t.t1();
		t.t2();
	}
}
