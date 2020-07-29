package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Ex77 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add(null);
		list.add("B");

		System.out.println(list);
		System.out.println(list.size());
	}

}
