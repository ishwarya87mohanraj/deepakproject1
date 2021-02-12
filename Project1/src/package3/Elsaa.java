package package3;

import java.util.Scanner;

public class Elsaa {
	static int x;
	static int y;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swapped without third variable " +x+ "and" +y);;
		
	}
}
