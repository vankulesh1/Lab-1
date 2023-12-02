package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lib {
    //add array of books
    private List<Book> books;

    public Lib(){
        this.books = new ArrayList<>();
    }
    //add book to the library
    public void addBook(Book book){
        books.add(book);
    }
}
