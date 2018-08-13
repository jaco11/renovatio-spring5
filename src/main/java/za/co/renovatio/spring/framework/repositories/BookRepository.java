package za.co.renovatio.spring.framework.repositories;

import org.springframework.data.repository.CrudRepository;
import za.co.renovatio.spring.framework.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
