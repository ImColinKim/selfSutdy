package loop;

public class While2_3 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int endNum = 150;

		while (i <= endNum) {
			sum += i;
			i++;
		}

		i=1;
		System.out.println( i +"부터 "+ endNum + "까지 더하면 " + sum);

	}
}
