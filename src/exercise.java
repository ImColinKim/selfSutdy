import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		int deposit = 100000000;
		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택");

			int i = scanner.nextInt();

			switch (i) {
				case 1 -> {
					System.out.println("얼마나 입금할까요?");
					i = scanner.nextInt();
					deposit += i;
					System.out.println(STR."\{i/10000}만원을 입금하였습니다. 잔고는 \{deposit}원입니다.");
				}
				case 2 -> {
					System.out.println("얼마를 출금할까요?");
					i = scanner.nextInt();
					deposit -= i;
					System.out.println(STR."\{i/10000}만원을 출금하였습니다. 잔고는 \{deposit}원입니다.");
				}
				case 3 -> {
					System.out.println(STR."잔고는 \{deposit}원입니다.");
				}
				case 4 -> {
					System.out.println("종료합니다.");
					scanner.close();
					isRunning = false;
				}
				default -> System.out.println("다시 확인해 주세요.");
			}
		}
	}
}
