package METHOD;

public class CallingStaticMethodFromDifferentClass {

	// 2. static method from different class -> we are calling method from example1
	// class
	public static void main(String[] args) {
		example1.addition();
		example1.subtration(65, 10);
	}
}
