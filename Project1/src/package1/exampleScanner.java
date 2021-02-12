package package1;

import java.util.Scanner;

public class exampleScanner {
	static int a;
	static int b;
	static int d;
	static int e;
	static int f;
	public static int addresult;
	public static int subresult;
	public static int againadd;
	public static int multiply;
	public static int divide;

	public int addition(int a, int b) {
		int c = a + b;
		return c;
	}

	public int subtraction() {
		return d;
	}

	public int multiply() {
		return e;
	}

	public int divide() {
		return f;
	}

	public static void main(String[] args) {
		
		exampleScanner ex = new exampleScanner();
		System.out.println("Enter a value for A ");
		Scanner ss = new Scanner(System.in);		
		a = ss.nextInt();
		System.out.println("Enter a value for B ");
		b = ss.nextInt();
		addresult = ex.addition(a,b);
		System.out.println("Add method results " + addresult);

		System.out.println("Enter a value for subtraction D");
		d = ss.nextInt();
		subresult = addresult - ex.subtraction();
		System.out.println("Sub method results " + subresult);

		System.out.println("Enter new number to add ");
		againadd = subresult + ss.nextInt();
		System.out.println("Again add method results " + againadd);

		System.out.println("Enter number to mutiply ");
		e = ss.nextInt();
		multiply = againadd * ex.multiply();
		System.out.println("Multiply method results " + multiply);

		System.out.println("Enter number to divide ");
		f = ss.nextInt();
		divide = multiply / ex.divide();
		System.out.println("Divide method results " + divide);
		
		ss.close();
	}

}
