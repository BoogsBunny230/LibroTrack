package librotrack.com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import librotrack.com.portfolio.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingOrAuthorContaining(String title, String author);
}
