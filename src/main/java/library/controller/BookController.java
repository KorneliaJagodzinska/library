package library.controller;

import library.BookDto;
import library.mapper.BookMapper;
import library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
class BookController {

    private final BookService service;

    @GetMapping
    public List<BookDto> getBooks() {
        return BookMapper.toBookDtoList(service.getBooks());
    }

    @PostMapping
    public void createBook(@RequestBody BookDto bookDto) {
        service.createBook(BookMapper.toBook(bookDto));
    }

    @DeleteMapping(path = "/{index}")
    public void deleteBook(@PathVariable("index") int index) {
        service.deleteBook(index);
    }

}
