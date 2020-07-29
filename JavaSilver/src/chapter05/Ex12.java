package chapter05;

public class Ex12 {
	public static void main(String[] args) {
		String[] array = {"A","B","C"};
		for(String str : array) {
			str = "D";
		}

		for(String str : array) {
			System.out.println(str);
		}
	}
}
