package chapter03.Ex09;

public class Sample {
	private int num;
	private String name;
	public Sample(int num,String name) {
		this.num = num;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Sample) {
			Sample s = (Sample) obj;
			if(s.name == this.name && s.num == this.num) {
				return true;
			}
		//	return s.num == this.num;
		}
		return false;
	}

}
