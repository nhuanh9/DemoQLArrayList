package com.company.service.impl;

import com.company.model.Book;
import com.company.service.GeneralService;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookServiceImpl implements GeneralService<Book> {
    private ArrayList<Book> listBook;

    public BookServiceImpl(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    public BookServiceImpl() {
        listBook = new ArrayList<>();
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Book book) {
        listBook.add(book);
    }

    @Override
    public void update(Book book, int id) {
        int index = findIndexById(id);
        listBook.set(index, book);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listBook.remove(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i));
        }
    }

    @Override
    public void sort() {
        listBook.sort((b1, b2) -> b1.getName().compareTo(b2.getName()));
    }
}
