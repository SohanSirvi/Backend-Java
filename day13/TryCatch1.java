package day13;

public class TryCatch1{
	public static void main(String[]args) {
		
		Array_Example1 t = new Array_Example1();
		t.array();
	}
}

class Array_Example1{
	public void array() {
		try {
			int arr[] = {10,20,30,40,50,60};
			System.out.println(arr[9]);
		}
		catch(Exception e){
//			e.getMessage();
//			e.printStackTrace();
			System.out.println("Index 9 out of bounds for length 6");
		}
	}
}



