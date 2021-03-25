package com.kodilla.patterns.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTesSuite {

    @Test
    void testGetBooks() {
        //given
        Book book1 = new Book("Teoria Wszystkiego", "Stephen Hawking", LocalDate.of(2005,03,8));
        Book book2 = new Book("Sezon Burz", "Andrzej Sapkowski", LocalDate.of(2013, 11, 11));
        Book book3 = new Book("Wlam sie do mozgu", "Radoslaw Kotarski", LocalDate.of(2017, 02, 05));
        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().add(new Book("Czysta Architektura", "Robert C. Martin",
                LocalDate.of(2018, 05, 15)));
        deepClonedLibrary.getBooks().remove(book1);

        //then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, shallowClonedLibrary.getBooks().size());
        assertEquals(2, deepClonedLibrary.getBooks().size());


    }
}
