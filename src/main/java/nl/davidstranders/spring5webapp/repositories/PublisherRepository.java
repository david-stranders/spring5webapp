package nl.davidstranders.spring5webapp.repositories;

import nl.davidstranders.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dell on 29-8-2017.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
