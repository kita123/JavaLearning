package jp.itacademy.samples.oop;

public class BookManager {

	public static void main(String[] args) {

		Book book = new Book("�ǂ����イJava", "���Ɂ[��", 3900);

		System.out.println(book.getTitle() + "(" + book.getAuthor() + ")"
				+ book.getPrice() + "�~");
	}
}
