package chapter10;

public class Ex68 {
	public static void main(String[] args) {
		BB b = new BB("f");
		b.sample("TEST");
		b.sample();
	}
}

class AA {
	public AA() {
		System.out.println("A:constructor");
	}
	public void sample() {
		System.out.println("A:sample");
	}
}

class BB extends AA {
	public BB(String str) {
		System.out.println("B:constructor");
	}
	public BB() {
		super();
	}
	public void sample() {
		super.sample();
	}
	public void sample(String str) {
		System.out.println("B:sample");
	}
}
