package my.project.library.controllers;

import lombok.RequiredArgsConstructor;
import my.project.library.models.Book;
import my.project.library.models.BookRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class BookController {

    final BookRepository bookRepository;
    @PostMapping("/book")
    public void createBook(@RequestBody Book book) {
        bookRepository.save(book);
    }


}
