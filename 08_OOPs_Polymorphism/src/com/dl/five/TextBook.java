package com.dl.five;

public class TextBook extends Subject {
	public void buyTextbooks(String textbookName, String textbookAuthor) {
		System.out.println("Textbook Name" + textbookName);
		System.out.println("Textbook Author" + textbookAuthor);
	}
	public static void main(String[] args) {
		Subject s = new TextBook();
		s.buyTextbooks("Maths", "Srinivasa Ramanujan");
	}

}