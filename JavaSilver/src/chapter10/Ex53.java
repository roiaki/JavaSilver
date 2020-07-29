package chapter10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex53 {
	public static void main(String[] args) {
		String date = LocalDateTime.parse("2007-12-03T10:15:30")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}

}
