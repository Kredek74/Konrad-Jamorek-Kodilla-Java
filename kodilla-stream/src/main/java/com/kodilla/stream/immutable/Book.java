package com.kodilla.stream.immutable;

public final class Book {
    private final String title;
    private final String author;
    private final int yearOfPulication;

    public Book (final String title, final String author, final int yearOfPulication) {
        this.title = title;
        this.author = author;
        this.yearOfPulication = yearOfPulication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPulication() {
        return yearOfPulication;
    }
}
