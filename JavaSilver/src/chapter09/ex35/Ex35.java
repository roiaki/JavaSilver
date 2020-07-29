package chapter09.ex35;

import java.util.ArrayList;

public class Ex35 {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<>();

		list.add(new Item("A", 100));
		list.add(new Item("B", 200));
		list.add(new Item("C", 300));
		list.add(new Item("A", 100));
		list.remove(new Item("A", 500));
		for(Item item : list) {
			System.out.println(item.getName());
			System.out.println(item.getPrice());
		}

	}

}
