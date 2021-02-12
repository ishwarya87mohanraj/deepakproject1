//December 13 assignments//

package package1;

public class Parent1 {

	public void p1() {
		this.p4(1, 2, 3);
		
		System.out.println("Parent default");
	}

	public void p2(int a) {
		this.p1();
		System.out.println("Parent 1 Paraeterized");
	}

	public void p3(int a, int b) {
		this.p2(1);
		System.out.println("Parent 2 Paraeterized");
	}

	public void p4(int a, int b, int c) {
		System.out.println("Parent 3 Paraeterized");
	}

	public void p5(int a, int b, int c, int d) {
		this.p3(1, 2);
		System.out.println("Parent 4 Paraeterized");
	}
}
