package za.co.renovatio.spring.framework.repositories;

import org.springframework.data.repository.CrudRepository;
import za.co.renovatio.spring.framework.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
