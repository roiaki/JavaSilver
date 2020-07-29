package chapter03;

public class Ex03 {
	public static void main(String[] args) {
		byte a  = (byte)0b10000000; //-128~127
		int  a2 =       0b10000000;
		byte a3 =      -0b10000000;
		short b = 128 + 128; //-32768~32767
		//int c = 2 * 3L;
		//float d = 10.0;
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);


	}

}
