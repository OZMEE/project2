package library.repositories;

import library.models.Book;
import library.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    void deleteById(int id);

    List<Book> findAllByName(String name);
}
