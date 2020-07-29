package chapter10;

public class Ex71 {
	private char a;
	private int b = 1;
	String test(char a, int b) {
		return a + "," + b;
	}

	public static void main(String[] args) {
		Ex71 app = new Ex71();
		System.out.println(app.test('A', 8));
	}

}
