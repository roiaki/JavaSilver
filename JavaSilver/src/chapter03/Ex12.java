package chapter03;

public class Ex12 {
	public static void main(String[] args) {
		String a = "sample";
		String b = "sample";

		//コンスタントプール
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}
