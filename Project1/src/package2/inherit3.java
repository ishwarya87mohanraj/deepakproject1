package package2;

import package1.inherit2;

public class inherit3 extends inherit2 {

	public void mughil() {
		System.out.println("Mughil");
	}

	public static void main(String[] args) {

		inherit3 second = new inherit3();
		
		second.jp();
		second.b=123;
		System.out.println(second.b);
		inherit2 one =new inherit2();
		one.jp();
	}

}
