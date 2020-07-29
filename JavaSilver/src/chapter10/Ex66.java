package chapter10;
class A {
	void hello() {
		System.out.println("A");
	}
	void hi() {
		System.out.println("hi");
	}
}

class B extends A{
	void hello() {
		System.out.println("B");
	}
}

class C extends A{
	void hello() {
		System.out.println("C");
	}
}
public class Ex66 {

	public static void main(String[] args) {
		A a = new B();
		B b = (B)a;
		C c = new C();
		A ss = (A)c;

	//	C c = (C)b;
		b.hello();
		b.hi();
		c.hello();
		ss.hello();
		ss.hi();

	}

}
