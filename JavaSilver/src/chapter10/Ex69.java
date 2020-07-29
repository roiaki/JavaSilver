package chapter10;

public class Ex69 {
	public static void main(String[] args) {
		int[] array = { 0, 1 ,3};
		int[][][] array2 = new int[2][3][4];
		array2[0][0] = array;
		array2[0][1] = array;
		array2[1][0] = array;
		array2[1][1] = array;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= 2; j++) {
				for (int k = 0; k < 2; k++) {
					System.out.print(array2[i][j][k] + " ");
				}
			}
		}
		System.out.println(array2);
	}
}
