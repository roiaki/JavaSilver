package chapter11;

public class Ex35 {

	public static void main(String[] args) {
		int[] array = new int[3];
		int[] array2 = {1, 2, 3, 4, 5};

		array = array2;

		for(int i : array) {
			System.out.println(i);
		}



	}

}
