package METHOD;

public class example1 {

	// 1. static method from same class
	public static void main(String[] args) {
		addition();
		subtration(50, 10);
	}

	public static void addition() {
		int a = 100;
		int b = 200;
		System.out.println("Addition:" + (a + b));
	}

	public static void subtration(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}
}
