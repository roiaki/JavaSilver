package chapter07.Ex01;

public class Child01 extends Parent01 {
	Child01() {
		name01 = "java";
	}
	public static void main(String[] args) {
		Child01 p = new Child01();
		p.id = 100;
		System.out.println(p.id + " " + p.name01);
	}
}
