package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceMockTest {

    BookRepository mockRepository;
    BookService service;

    @BeforeEach
    void setUp() {
        mockRepository = mock(BookRepository.class);
        service = new BookService(mockRepository);
    }

    @Test
    void findBookById() {
        Book book = new Book("1", "Book1", "Author1");
        when(service.findBookById(anyString())).thenReturn(book);

        assertEquals(book, service.findBookById("1"));
    }

    @Test
    void findAllBooks() {
        List<Book> books = Arrays.asList(new Book("1", "Book1", "Author1"),
                                            new Book("2", "Book2", "Author2"),
                                            new Book("3", "Book3", "Author3"));
        when(service.findAllBooks()).thenReturn(books);

        assertEquals(books, service.findAllBooks());
    }
}