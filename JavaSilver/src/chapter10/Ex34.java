package chapter10;

public class Ex34 {
	String val = "7";

	public void doStuff(String str) {
		int num = 0;

		try {
			String val = str;
			num = Integer.parseInt(val);
		} catch (NumberFormatException e) {
			System.out.println("error");
		}
		System.out.println("val=" + val + " num=" + num);
	}

	public static void main(String[] args) {
		new Ex34().doStuff("9");
	}

}
