package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book firstBook = new Book(1, "Anatomical Atlas", 228, "Trevor Weston");
    private Book secondBook = new Book(2, "Human anatomy", 307, "Trevor Weston");

    @Test
    public void shouldRemoveByID() {
        repository.save(firstBook);
        repository.save(secondBook);
        Product[] expected = new Product[]{secondBook};
        repository.removeById(1);
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}