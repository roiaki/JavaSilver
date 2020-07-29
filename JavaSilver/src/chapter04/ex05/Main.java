package chapter04.ex05;

public class Main {
	public static void main(String[] args) {
		Item[] items = new Item[3];

		int total = 0;
		for(int i = 0; i < items.length; i++) {
//			items[i] = new Item();
			total = total + items[i].price;
		}
		System.out.println(total);
	}

}
