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
//print all the books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitleBook() + "\t" + book.getAuthorBook() + "\t" + book.getIsbnBook() + "\t" + book.getYearBook());
        }
    }

    //search a book by title
    public Book searchBookTitle(String titleBook) {
        for (Book book : books) {
            if (book.getTitleBook().equalsIgnoreCase(titleBook)) {
                return book;
            }
        }
        return null; // Книга не знайдена
    }

    //remov a book by ISBN
    public void removeBookISBN(String isbnBook) {
        books.removeIf(book -> book.getIsbnBook().equals(isbnBook));
    }
}