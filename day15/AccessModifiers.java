package day15;

public class AccessModifiers extends One{
	public static void main(String[] args) {
//		One o = new One();
//		o.m1();
		
		AccessModifiers z = new AccessModifiers();
		z.m1();
	
	}
}

class One{
	public int a = 33;
	private String name = "SOHAN";
	private float b = 3.14f;
	double c = 3.14;
	
	public void m1() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(b+" This value is stored in float");
		System.out.println(c);
	}
	
}
