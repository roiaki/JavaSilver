package chapter09;

public class Ex16 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");

		sb.append("de").insert(2, "g");
		System.out.println(sb);
	}
}
