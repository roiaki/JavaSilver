package chapter10;
import java.io.IOException;
class X {
	public void print() throws IOException {
		throw new IOException();
	}
}
public class Ex18 {

	public static void main(String[] args) throws IOException {
		X obj = new X();
		obj.print();

	}

}
