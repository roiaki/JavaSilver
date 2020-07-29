package chapter07.Ex05;

abstract class AbstractSample {
	public void sample() {
		System.out.println("A");
		test();
		System.out.println("C");
	}
	//抽象メソッド
	protected abstract void test();

}

class ConcreteSample extends AbstractSample {
	//具象メソッド
	protected void test() {
		System.out.println("B");
	}
}