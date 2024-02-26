package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


    while (true) {
		System.out.print("하나의 정수를 입력하세요: ");
		int num = scanner.nextInt();

			if (num % 2 == 0 && num != 0) {
			System.out.println(num + "는 짝수입니다.");
			} else {
			System.out.println(num + "는 홀수입니다.");
			}

			if (num == 0) {
				System.out.println("장비를 정지합니다.");
				break;
			}
		}
	}
}
