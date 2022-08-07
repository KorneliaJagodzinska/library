package library.service;

import library.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    void createBook(Book book);
    void deleteBook(int index);
}
