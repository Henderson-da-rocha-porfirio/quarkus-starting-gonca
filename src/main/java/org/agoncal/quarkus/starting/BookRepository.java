package org.agoncal.quarkus.starting;

import jakarta.enterprise.context.*;
import org.eclipse.microprofile.config.inject.*;

import java.util.*;

@ApplicationScoped
public class BookRepository {

        @ConfigProperty(name = "books.genre", defaultValue = "Sci-Fi")
        String genre;

        public List<Book> getAllBooks() {
            return List.of(
                    new Book(1, "Understanding Quarkus", "Antonio", 2020, genre),
                    new Book(2, "Practising Quarkus", "Antonio", 2020, genre),
                    new Book(3, "Effective Java", "Josh Bloch", 2001, genre),
                    new Book(4, "Thinking in Java", "Bruce Eckel", 1998, genre));
        }

        public Optional<Book> getBook(int id) {
            return getAllBooks().stream().filter(book -> book.id == id).findFirst();
        }
}
