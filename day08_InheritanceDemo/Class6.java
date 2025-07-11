package day08_InheritanceDemo;

public class Class6 extends Class7{
	public void evenodd() {
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				System.out.println("Even Numbers: "+i);
			}
			else {
				System.out.println("Odd Numbers: "+i);
			}
		}
	}
}
