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
        if (titleFragment.length() < 3) return booklist;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return booklist;
        booklist = resultList;
        return booklist;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        return resultList;
    }
}
