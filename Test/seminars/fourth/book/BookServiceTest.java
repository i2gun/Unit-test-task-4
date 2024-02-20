package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookRepository repository;
    BookService service;

    @BeforeEach
    void setUp() {
        repository = new InMemoryBookRepository();
        service = new BookService(repository);
    }

    @Test
    void findBookById() {
        assertEquals("1", service.findBookById("1").getId());
    }

    @Test
    void findAllBooks() {
        List<String> books = Arrays.asList("1", "2");
        assertEquals(books, service.findAllBooks().stream().map(x -> x.getId()).collect(Collectors.toList()));
    }
}