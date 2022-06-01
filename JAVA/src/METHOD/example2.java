package METHOD;

public class example2 {

	//3. Calling non-static method from same class
	public static void main(String[] args) {

		example2 ex2 = new example2();
		ex2.addition();
		ex2.subtraction(89, 10);
	}

	public void addition() {
		int a = 100;
		int b = 20;
		System.out.println("Addition:" + (a + b));
	}
	
	public void subtraction(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
	}
}
