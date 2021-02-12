package package3;

import java.util.Scanner;

public class AnnaClass {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter  A");
		int a = s.nextInt();
		System.out.println("Please enter  B");
		int b = s.nextInt();
		int x=a;
		a=b;
		b=x;
		System.out.println("Swapped values are" +a+" " +b);
	}

}
