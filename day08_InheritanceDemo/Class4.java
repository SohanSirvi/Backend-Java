package day08_InheritanceDemo;

public class Class4 extends Class5{
	public void starpattern2() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
