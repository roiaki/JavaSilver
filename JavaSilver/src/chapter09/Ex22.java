package chapter09;

public class Ex22 {
	public static void main(String[] args) {
		Function f = (name) -> {
			return "hello " + name;
		};
		System.out.println(f.test("Lambda"));
	}

	private static interface Function {
		String test(String name);
	}

}
