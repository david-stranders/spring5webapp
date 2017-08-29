package nl.davidstranders.spring5webapp.repositories;

import nl.davidstranders.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dell on 29-8-2017.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
