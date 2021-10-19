package com.company;

import com.company.model.Book;
import com.company.service.impl.BookServiceImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.add(new Book(1, "Hello", "NA"));
        bookService.add(new Book(2, "Hello 1", "NA"));
        bookService.add(new Book(3, "Hello 2", "NA"));
        bookService.update(new Book(2, "Blo", "NS"), 2);
        bookService.deleteById(3);
        bookService.print();
        bookService.sort();
        bookService.print();
    }
}
