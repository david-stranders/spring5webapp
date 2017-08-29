package nl.davidstranders.spring5webapp.repositories;

import nl.davidstranders.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dell on 29-8-2017.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
