package chapter10;

public class Ex38 {
	static double total;
	static int aa ;
	static int bb;
	public static void main(String[] args) {
		System.out.println(aa + " " + bb);
		double x = 0, a = 0, b = 0;
		if(total == 0) {
			a = 3;
			b = 4;
			x = 0.5;
		}
		total = x * a + b;
		System.out.println(total);
	}

}
