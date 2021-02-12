package package1;

public class exampleforInterface implements interface1 {
	
	public void method10(){
		System.out.println("Method 10");
	}
	
	public void method20(){
		System.out.println("Method 20");
	}

	public static void main(String[] args) {
		exampleforInterface obj1 = new exampleforInterface();
		obj1.method10();
		obj1.method20();
	}
}
