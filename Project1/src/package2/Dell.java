package package2;

import package1.*;

public class Dell extends Laptop {

	public Dell() {
		super(1);
		System.out.println("Child default constructor");
	}

	public Dell(int a) {
		this();	
		System.out.println("Child One parameterized constructor");
	}

	public Dell(int a, int b) {
		this(1, 2, 3);
		System.out.println("Child two parameterized constructor");
	}

	public Dell(int a, int b, int c) {
		this(10);
		System.out.println("Child three parameterized constructor");
	}

	public Dell(int a, int b, int c, int d) {
		this(1, 2);
		System.out.println("Child four parameterized constructor");
	}

	public static void main(String[] args) {
		Dell d = new Dell(1, 2, 3, 4);
	}

}
