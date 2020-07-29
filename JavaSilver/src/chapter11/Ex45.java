package chapter11;

public class Ex45 {

	public static void main(String[] args) {
		String str = "a b c 3 d e";
		String[] array = str.split("\\d");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
