package com.vin.java.functionalinterface.demo;
import java.util.Collections;
import java.util.List;

public class BookService {
	
	public List<Book> getBooksInSort(){
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		BookService bs = new BookService();
		System.out.println(bs.getBooksInSort());
	}

}

/*
 * class MyComparator implements Comparator<Book>{
 * 
 * @Override public int compare(Book o1, Book o2) { return
 * o1.getName().compareTo(o2.getName()); } }
 */
