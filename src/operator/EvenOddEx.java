package operator;

public class EvenOddEx {
	public static void main(String[] args) {
		int x = 19;
		String Even = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x 는 " + Even + "입니다.");
	}
}
