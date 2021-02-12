package package1;

public class methodUsingThis {
	public void method() {
		System.out.println("Default Parameterized Method");
		this.method2(1,2);
	}

	public void method1(int a) {
		System.out.println("One Parameterized Method");
	}

	public void method2(int a, int b) {
		System.out.println("Two Parameterized Method");
		this.method3(1,2,3);
	}

	public void method3(int a, int b, int c) {
		System.out.println("Three Parameterized Method");
		this.method1(1);
	}

	public void method4(int a, int b, int c, int d) {
		System.out.println("Four Parameterized Method");
		this.method();
	}

	public static void main(String[] args) {
		methodUsingThis ish = new methodUsingThis();
		ish.method4(1,2,3,4);
	}

}
