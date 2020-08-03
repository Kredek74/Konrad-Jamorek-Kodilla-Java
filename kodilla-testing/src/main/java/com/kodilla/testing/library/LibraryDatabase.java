package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //lists books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //returns true when success
    //and returns false when book in unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //return number of bokks returned back
    int returnBooks(LibraryUser libraryUser);
}