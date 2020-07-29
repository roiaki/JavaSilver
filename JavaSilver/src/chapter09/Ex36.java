package chapter09;

import java.util.ArrayList;

public class Ex36 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
//		list.add("D");
//		list.add("E");
		boolean flag = false;
		for(String str : list) {
			if(str.equals("B")) {
				flag = list.remove(str);
				System.out.println(flag);
			} else {
				System.out.println(str);

			}
		}
	}
}
