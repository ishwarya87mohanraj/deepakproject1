package package1;

public class contructor1 {

	public contructor1() {
		this(1.02, 2.02, 3.02, 4.0);
		System.out.println("Default Constructor");
	}

	public contructor1(int b) {
		this();
		System.out.println("One Param Constructor");
	}

	public contructor1(int c, int d) {
		this("a", "b", "c");
		System.out.println("Two Param Constructor");
	}

	public contructor1(String A, String B, String c) {
		this(1);
		System.out.println("Three Param Constructor");
	}

	public contructor1(double x, double y, double z, double w) {
		System.out.println("Four Paramterized Constructor");
	}

	public static void main(String[] args) {
		contructor1 constr2 = new contructor1(1, 3);
	}

}
