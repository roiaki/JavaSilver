package chapter09;

public class Ex02 {
	public static void main(String[] args) {
		String str = "hoge, world";
		String str2 = hello(str);

		//hello(str2);
		System.out.println(str);
		System.out.println(str2);
	}
	private static String hello(String msg) {
		return msg.replaceAll("hoge", "hello");
	}

}
