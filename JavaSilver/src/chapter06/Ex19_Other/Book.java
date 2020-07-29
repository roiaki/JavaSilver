package chapter06.Ex19_Other;

public class Book {
	private String isbn;
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	//アクセス修飾子がprotected だとエラー
	//protected 同一パッケージかサブクラスがアクセス可能
	public void printInfo() {
		System.out.println(isbn);
	}
}
