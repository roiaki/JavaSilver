package chapter08.Ex03;

public class Ex03 {
	public static void main(String[] args) {
		try {
			sample();
			sub();
		} catch (SampleException e) {
			System.out.println("A");
//		} catch (SubSampleException e) {
//			System.out.println("B");
		}

	}

	private static void sample() throws SampleException {
		throw new SampleException();
	}

	private static void sub() throws SubSampleException {
		throw new SubSampleException();
	}

}
