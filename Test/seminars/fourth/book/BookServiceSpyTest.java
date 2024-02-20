package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceSpyTest {

    BookRepository mockRepository;
    BookService service;

    @BeforeEach
    void setUp() {
        mockRepository = spy(BookRepository.class);
        service = new BookService(mockRepository);
    }

    @Test
    void findBookById() {
        Book book = service.findBookById("1");

        verify(mockRepository, times(1)).findById("1");
    }

    @Test
    void findAllBooks() {
        List<Book> books = service.findAllBooks();

        verify(mockRepository, times(1)).findAll();
    }
}