package package1;

public class Laptop {

	public Laptop() {
		this(1, 2);
		System.out.println("Parent Default COnstructor");
	}

	public Laptop(int a) {
		this(1, 2, 3);
		System.out.println("Parent one para COnstructor");
	}

	public Laptop(int a, int b) {
		System.out.println("Parent two para COnstructor");

	}

	public Laptop(int a, int b, int c) {
		this(1, 2, 3, 4);
		System.out.println("Parent three para COnstructor");
	}

	public Laptop(int a, int b, int c, int d) {
		this();
		System.out.println("Parent four para COnstructor");
	}

}
