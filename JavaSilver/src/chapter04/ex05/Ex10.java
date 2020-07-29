package chapter04.ex05;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		int[] A = {1,2,3};
		int[] B = A.clone();
		System.out.println(A == B);
		System.out.println(Arrays.equals(A,B));
	}

}
