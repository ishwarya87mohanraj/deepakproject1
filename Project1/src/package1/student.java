package package1;

public class student {
	int age;
	int rollnumber;
	String A = "Ishwarya Mohanraj";

	public void display1() {
		System.out.println("Welcome ONE");
	}

	public void display2() {
		System.out.println("Welcome TWO");
	}

	public static void main(String[] args) {
		student stu = new student();
		stu.age = 30;
		stu.rollnumber = 12345;
		System.out.println("The AGE is " + stu.age);
		System.out.println("Rollnumber is " + stu.rollnumber);
		System.out.println("Name of the person is " + stu.A);
		stu.display1();
		stu.display2();
	}
}
