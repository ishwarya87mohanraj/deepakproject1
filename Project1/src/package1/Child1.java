//December 13 assignments//
package package1;

public class Child1 extends Parent1 {
	public void m1() {
		super.p5(1,2,4,4);
		System.out.println("Child default");
	}

	public void m2(int a) {
		this.m2(1, 2, 3);
		System.out.println("Child 1 Paraeterized");
	}

	public void m2(int a, int b) {
		this.m2(1);
		System.out.println("Child 2 Paraeterized");
	}

	public void m2(int a, int b, int c) {
		this.m1();
		System.out.println("Child 3 Paraeterized");
	}

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.m2(1, 2);
	}
}

// if we make final method in parent class, we can't inherit the same in child// very good//
// this and super keywords
// static and dynamic 
