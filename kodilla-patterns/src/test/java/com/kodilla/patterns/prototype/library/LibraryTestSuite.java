package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testShallowCopy() throws CloneNotSupportedException {
        //given
        Library library = new Library("Miejska Biblioteka Publiczna");
        library.getBooks().add(new Book("title1", "author1", LocalDate.of(2000, 1, 20)));
        library.getBooks().add(new Book("title2", "author2", LocalDate.of(1998, 6, 15)));
        library.getBooks().add(new Book("title3", "author3", LocalDate.of(2007, 2, 5)));
        //when
        Library shallowCopy = library.shallowCopy();
        //then
        library.getBooks().add(new Book("title4", "author4", LocalDate.of(2010, 12, 1)));
        assertEquals(library.getBooks().size(), shallowCopy.getBooks().size());
        assertNotEquals(library, shallowCopy);
    }
    @Test
    void testDeepCopy() throws CloneNotSupportedException {
        //given
        Library library = new Library("Miejska Biblioteka Publiczna");
        library.getBooks().add(new Book("title1", "author1", LocalDate.of(2000, 1, 20)));
        library.getBooks().add(new Book("title2", "author2", LocalDate.of(1998, 6, 15)));
        library.getBooks().add(new Book("title3", "author3", LocalDate.of(2007, 2, 5)));
        //when
        Library deepCopy = library.deepCopy();
        //then
        library.getBooks().add(new Book("title4", "author4", LocalDate.of(2010, 12, 1)));
        assertNotEquals(library.getBooks().size(), deepCopy.getBooks().size());
        assertNotEquals(library, deepCopy);
    }
}