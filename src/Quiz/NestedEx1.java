package Quiz;

public class NestedEx1 {
	public static void main(String[] args) {

//		for (int i = 1; i <= 9; i++) {
//			for (int dan = 1; dan <= 9; dan++) {
//				System.out.println(dan + " * " + i + " = " + i*dan);
//			}
//		}

		int a = 3;

		for (int b = 1; b <= 9; b++) {
			int c = a * b;
			System.out.println(a + " * " + b + " = " + c);
		}
	}
}
