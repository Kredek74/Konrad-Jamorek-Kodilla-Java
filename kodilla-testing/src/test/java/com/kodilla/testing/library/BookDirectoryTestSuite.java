package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {

        //Given

        List<Book> resultListOfBook = new ArrayList<Book>();
        Book book1 = new Book("Secret of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Director", "Dilibert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secret of Java", "Ian Tenewitch", 2010);
        resultListOfBook.add(book1);
        resultListOfBook.add(book2);
        resultListOfBook.add(book3);
        resultListOfBook.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBook);

        //When
        List<Book> theListOfBook = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBook.size());
    }

    @Test
    public void testListBooksWithConditionsMoreThan20() {
        //Given

        List<Book> resultOf0Books = new ArrayList<Book>();
        List<Book> resultOf15Books = generateListOfBooks(15);
        List<Book> resultOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("AnyTitle");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionsFragmentShorterThan3() {
        //Given

        List<Book> resultListOf10Books = generateListOfBooks(10);
        when (libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOfBook10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0, theListOfBook10.size());
        verify(libraryDatabaseMock,times(0)).listBooksWithCondition(anyString());
    }
}
