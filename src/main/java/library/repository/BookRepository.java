package library.repository;

import library.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    void save(Book book);
    void deleteByIndex(int index);
}
