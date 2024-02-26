package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;

		while (true) {
			System.out.println("수를 입력하세요");
			int num = input.nextInt();
			sum += num;

			if (num == 0) {
				System.out.println("지금까지 입력한 수의 합은" + sum);
				System.out.println("종료");
				break;
			}
		}
	}
}