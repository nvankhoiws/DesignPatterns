package com.udemy.balazsholczer.solid.single_responsibility_principle;

public class Book implements BookHandler {

	private BookPersistence bookPersistence;
	private BookPrinter bookPrinter;
	private int numOfPages;
	private String authorName;

	public Book(String authorName, int numOfPages) {
		this.authorName = authorName;
		this.numOfPages = numOfPages;
		this.bookPersistence = new BookPersistence();
		this.bookPrinter = new BookPrinter();
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	@Override
	public void save() {
		this.bookPersistence.save(this);
	}

	@Override
	public void print() {
		this.bookPrinter.print(this);
	}

	@Override
	public String toString() {
		return authorName + " - " + numOfPages;
	}
}
