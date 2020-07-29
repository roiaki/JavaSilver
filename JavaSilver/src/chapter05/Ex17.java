package chapter05;

public class Ex17 {
	public static void main(String[] args) {
		int total = 0;

		int a = 3;
		System.out.println(3 < a);



		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0)
					continue a;
				if (3 < j)
					break b;
				total += j;
			}
		}
		System.out.println(total);
	}

}
