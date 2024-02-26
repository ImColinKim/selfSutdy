package Quiz;

public class WhileEx3 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int max = 10;

		while (i <= max) {
			sum +=i;
			i++;
		}
		System.out.println("max = " + i + " sum = " + sum);

		for (i = 1, sum = 0; i <= max; i++) {
			sum += i;
		}
		System.out.println("max = " + i + " sum = " + sum);
	}
}
