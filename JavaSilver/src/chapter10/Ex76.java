package chapter10;

public class Ex76 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int i = 1;
		for (int num : array) {

			while (i <= num) {
				System.out.println(i++);
			}
		}
	}

}
