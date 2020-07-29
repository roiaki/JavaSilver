package chapter09;

public class Ex10 {
	public static void main(String[] args) {
		String str = "a. b. c. d. e";

		String[] array = str.split("\\.\\s");

		for(String s : array) {
			System.out.println(s);
		}
	}

}
