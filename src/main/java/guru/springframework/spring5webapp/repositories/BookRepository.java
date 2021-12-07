package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author z-darvishian
 * @created 07/12/2021 - 11:37 AM
 */
public interface BookRepository extends CrudRepository<Book,Long> {

}
