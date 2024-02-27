package array;

public class Array1Ref4 {
	public static void main(String[] args) {

	int[] students = {90, 80, 70, 60, 50};

	for (int i = 0; i < students.length; i++) {
		System.out.println("students" + (1+i) + "점수 = " + students[i]);
	}

	int[] teachers = new int[5];
//	문법 오류 teachers = {100, 200, 300, 400, 500};

	}
}
