package package1;

public class assignment2 {
	public int divide(int a, int b) {
		int c = a / b;
		System.out.println("First Divide " + c);
		return c;
	}

	public int subtract(int d) {
		System.out.println("Second subtract " + d);
		return d;
	}

	public int sum(int e) {

		System.out.println("Third addition " + e);
		return e;
	}

	public int multiply(int f) {
		System.out.println("Fourth Multiply " + f);
		return f;
	}

	public static void main(String[] args) {
		assignment2 example = new assignment2();
		int divideresult = example.divide(10, 2);
		int subtractresult = divideresult - example.subtract(2);
		int addresult = subtractresult + example.sum(2);
		int againsubtract = addresult - example.subtract(2);
		int multiplyresult = againsubtract * example.multiply(2);
		System.out.println("****Final Result**** " + multiplyresult);
	}

}
