package package1;

public class exampleMethod {
	public int sum(int a, int b) {
		int d = a + b;
		System.out.println("First addition " + d);
		return d;
	}

	public int subtract(int e) {
		System.out.println("Second subtract " + e);
		return e;
	}

	public int multiply(int f) {
		System.out.println("Third Multiply " + f);
		return f;
	}

	public int divide(int g) {
		System.out.println("Fourth Divide " + g);
		return g;
	}
	
	public static void main(String[] args) {
		exampleMethod example = new exampleMethod();
		int sumresult = example.sum(10, 2);
		int secondsumresult = example.sum(sumresult, 2);
		int subtractresult = secondsumresult - example.subtract(2);
		int multiplyresult = (subtractresult * example.multiply(2));
		int divideresult = (multiplyresult / example.divide(2));
		System.out.println("****Final Result**** " +divideresult);
	}

}
