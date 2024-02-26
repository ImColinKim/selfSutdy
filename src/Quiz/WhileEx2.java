package Quiz;

public class WhileEx2 {
	public static void main(String[] args) {
		int num = 0, count = 1;

		while (count <= 10) {
			num += 2;
			System.out.println(num);
			count++;
		}

		for (num = 2, count = 1; count <= 10 ; num += 2, count++) {
			System.out.println(num);
		}
	}
}
