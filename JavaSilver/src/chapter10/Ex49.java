package chapter10;

public class Ex49 {
	String a;
	boolean b;
	double c;

	public Ex49() {
		this.a = "sample";
		this.b = true;
		this.c = 100;
	}

	public String toString() {
		return a + ":" + b + ":" + c;
	}

	public static void main(String[] args) {
		Ex49 s = new Ex49();
		System.out.println(s);
	}
}
