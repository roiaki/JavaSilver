package chapter09;

import java.time.LocalTime;

public class Ex27 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(0, 1, 2);
		LocalTime time2 = time.plusHours(12);

		System.out.println(time);
		System.out.println(time2);
	}

}
