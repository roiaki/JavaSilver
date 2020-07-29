package chapter11.ex36;

public class C extends A {
	public void sample() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new C();

		B b1 = (B) a1;

//		a1 = (A) a2;
//		A a3 = (B) a2;
		a1.sample();
		a2.sample();

		b1.sample();
	}
}

