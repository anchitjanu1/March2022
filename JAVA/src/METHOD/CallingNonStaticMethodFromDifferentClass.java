package METHOD;

public class CallingNonStaticMethodFromDifferentClass {

	// 4. Callling non static method from different class -> we are calling methods
	// from example2
	public static void main(String[] args) {
		example2 ex2 = new example2();
		ex2.addition();
		ex2.subtraction(100, 20);
	}
}
