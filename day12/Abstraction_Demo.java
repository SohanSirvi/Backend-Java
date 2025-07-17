package day12;

public class Abstraction_Demo extends Games{
	
	public void plays() {
		System.out.println("Sohan plays both types of games like Indoor & Outdoor, as mentioned below ↓ ");
		System.out.println();
	}
	
	public static void main(String[]args) {
		Abstraction_Demo a = new Abstraction_Demo();
		a.plays();
		
		Cricket c = new Cricket();
		c.plays();
		
		Football f = new Football();
		f.plays();
		
		Kabaddi k = new Kabaddi();
		k.plays();
		
		Carrom c1 = new Carrom();
		c1.plays();
		
		Cards c2 = new Cards();
		c2.plays();
		
		Chess c3 = new Chess();
		c3.plays();		
	}
	
}

class Cricket extends Games{
	public void plays() {
		System.out.println("1) Sohan plays Cricket & it is an Outdoor Sport.");
	}
}

class Football extends Games{
	public void plays() {
		System.out.println("2) Sohan plays Football & it is an Outdoor Sport.");
	}
}

class Kabaddi extends Games{
	public void plays() {
		System.out.println("3) Sohan plays Kabaddi & it is an Outdoor Sport.");
	}
}

class Carrom extends Games{
	public void plays() {
		System.out.println("4) Sohan plays Carrom & it is an Indoor Sport.");
	}
}

class Cards extends Games{
	public void plays() {
		System.out.println("5) Sohan plays Cards &it is an Indoor Sport.");
	}
}

class Chess extends Games{
	public void plays() {
		System.out.println("6) Sohan plays Chess & it is an Indoor Sport.");
	}
}



abstract class Games{
	abstract public void plays();
}






