package chapter09;

import java.util.ArrayList;

public class Ex33 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(2,"x");
		for(String str : list) {
			System.out.println(str);
		}
	}

}
