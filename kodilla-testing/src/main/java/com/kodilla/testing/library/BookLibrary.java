package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> booklist = new ArrayList<Book>();
        Book book = new Book("The book title", "The book author", 2000);
        booklist.add(book);

        //temporary returning list of one book
        return booklist;
    }
}