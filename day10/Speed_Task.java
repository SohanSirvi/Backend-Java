package day10;

import java.util.Scanner;

public class Speed_Task {
	
	public static void calculateSpeed(float d, float t) {
		float time = t/60;
		float speed = d/time;
		float fare = d*6;
		System.out.println("This is the speed you travelled to complete the journey: "+speed+" km/hr");
		System.out.println("Total fare is: "+"₹"+fare);
	}
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Distance to be Travelled in Kilometer: ");
		float d = sc.nextFloat();
		
		System.out.println("Enter Time to reach the destination in minutes: ");
		float t = sc.nextFloat();
				
		calculateSpeed(d,t);
	}
	
	
}
