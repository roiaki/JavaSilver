package chapter10;

class Sample {
	int num;

	Sample(int num) {
		this.num = num;

	}
}

public class Ex64 {

	public static void main(String[] args) {
		Sample[] array = {
				new Sample(10),
				new Sample(20)
		};
		Sample[] array2 = new Sample[2];

		System.arraycopy(array, 0, array2, 0, array.length);
		array2[1].num = 99;

		System.out.println(array[1].num);
	}

}
