package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주문하실 음식을 선택하세요");
		String foodName = scanner.nextLine();

		System.out.println("음식 가격을 선택하세요");
		int foodPrice = scanner.nextInt();

		System.out.println("음식 수량을 선택하세요");
		int foodQuantity = scanner.nextInt();

		System.out.println(foodName + " " + foodQuantity + "개를 선택하셨습니다." + " 가격은 " + (foodPrice*foodQuantity) + "원 입니다.");
	}
}
