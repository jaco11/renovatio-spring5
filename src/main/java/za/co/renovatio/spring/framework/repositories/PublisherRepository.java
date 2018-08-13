package za.co.renovatio.spring.framework.repositories;

import org.springframework.data.repository.CrudRepository;
import za.co.renovatio.spring.framework.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
