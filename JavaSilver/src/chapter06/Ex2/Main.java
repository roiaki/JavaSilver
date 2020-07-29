package chapter06.Ex2;

public class Main {
	public static void main(String[] args) {
		Sample s = new Sample();
//		String val = s.setValue("hellow");//誤り
		s.setValue("hello");	//追加
		String val2 = s.getValue();

		System.out.println(val2);
	}

}
