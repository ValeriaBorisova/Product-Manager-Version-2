package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Book book = new Book(1, "Anatomical Atlas", 228, "Trevor Weston");
    private Smartphone smartphone = new Smartphone(3, "8.3", 49_990, "Nokia");

    @Test
    void shouldNotMatchesSearch() {
        boolean actual = smartphone.matches(smartphone, "");
        assertEquals(false, actual);
    }

    @Test
    void bookShouldNotMatchesSmartphone() {
        boolean actual = smartphone.matches(book, "Trevor Weston");
        assertEquals(false, actual);
    }

    @Test
    void shouldMatchesBookByTitle() {
        boolean actual = smartphone.matches(smartphone, "8.3");
        assertEquals(true, actual);
    }

    @Test
    void shouldMatchesBookByManufacturer() {
        boolean actual = smartphone.matches(smartphone, "Nokia");
        assertEquals(true, actual);
    }
}
