package chapter06.Ex07;

public class Ex07 {
	public static void main(String[] args) {
		Sample.num = 10;
		Sample s = new Sample();
		Sample s2 = new Sample();

		Sample.num += 10;
		s2.num = 30;
		System.out.println(Sample.num);
	}

}
