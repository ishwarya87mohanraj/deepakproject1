package package1;

public class ish_firstClass {
	int a;
	int b = 20;
	int c = 88;

	public void ish() {
		System.out.println("Hello Ishwarya!");
	}

	public void jp(int a, int b) {

		int c = a + b;
		System.out.println("Parameterized method " +c);
	}

	public static void main(String[] args) {
		ish_firstClass first = new ish_firstClass();
		first.ish();
		first.a = 45;
		System.out.println(first.a);
		System.out.println(first.b);
		first.a = 90;
		System.out.println(first.a);
		System.out.println(first.c);
		first.jp(10, 20);
	}
}
