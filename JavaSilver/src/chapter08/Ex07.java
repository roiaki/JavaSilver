package chapter08;

public class Ex07 {
	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);
	}

	private static int sample() {
		int val = 0;
		try {
			String[] array = { "A", "B", "C" };
			System.out.println(array[3]);
		} catch (RuntimeException e) {
			val = 10;
			return val;
		} finally {
			System.out.println("before" + val);
			val += 10;
			System.out.println("after" + val);

		}
		System.out.println(val);
		return val;
	}
}
