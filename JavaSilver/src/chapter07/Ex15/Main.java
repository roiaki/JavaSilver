package chapter07.Ex15;

public class Main {
	public static void main(String[] args) {
		Child child  = new Child();
		//child.name = "sample";//
		Parent c = new Child();
		Child cc = (Child) c;
		cc.name = "sample";
		System.out.println(cc.getName1());


	}
}
