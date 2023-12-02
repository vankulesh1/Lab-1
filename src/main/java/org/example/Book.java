package org.example;

public class Book {
    private String titleBook;
    private String authorBook;
    private String isbnBook;
    private int yearBook;

    public Book(String titleBook, String authorBook, String isbnBook, int yearBook)
    {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.isbnBook = isbnBook;
        this.yearBook = yearBook;
    }
    //getters
    public String getTitleBook(){
        return titleBook;
    }
    public String getAuthorBook(){
        return authorBook;
    }
    public String getIsbnBook(){
        return isbnBook;
    }
    public int getYearBook(){
        return yearBook;
    }
}
