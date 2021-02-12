package package1;

public class pyramidPattern {
	public static int n;

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* "); /// important line
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}

//26th december assignment - pyramid * program
