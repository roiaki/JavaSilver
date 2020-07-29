package chapter10;

public class Ex14 {
	public static void main(String[] args) {
		String str = " ";

		String str2 = str.trim();
		System.out.println("str:"  + str);
		System.out.println("str2:" + str2);
		System.out.println(str.equals("") + " : "  + str.isEmpty());
		System.out.println(str2.equals("") + " : " + str2.isEmpty());
	}

}
