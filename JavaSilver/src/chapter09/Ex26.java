package chapter09;

import java.time.LocalDate;

public class Ex26 {
	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2018, 9, 25);
		LocalDate b = LocalDate.parse("2018-09-25");

		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
	}

}
