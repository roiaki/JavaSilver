package chapter04;

public class Ex06 {
	public static void main(String[] args) {
		String[] array = {"A", "B", "C", "D"};

		array[0] = null;
//		array[0].length();
		for(String s : array) {
			System.out.println(s);
		}
	}

}
