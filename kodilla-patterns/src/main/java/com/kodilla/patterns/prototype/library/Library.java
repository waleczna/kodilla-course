package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

class Library implements Cloneable {
    final private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
        Object o;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
       return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library newLibrary = (Library) super.clone();
        newLibrary.books = new HashSet<>();
        for (Book book : books) {
            newLibrary.books.add(book);
        }
        return newLibrary;
    }
}

