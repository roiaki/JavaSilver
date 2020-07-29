package chapter04.ex05;

public class Ex08 {
	public static void main(String[] args) {
		String[][] array = {{"A","B"} , {"C","D","E"}};

		int total = 0;

		for(String[] tmp : array) {
			for(String s : tmp) {
				System.out.println(s);
			}
		}
		System.out.println(total);
	}

}
