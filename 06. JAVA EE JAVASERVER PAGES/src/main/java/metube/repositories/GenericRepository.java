package metube.repositories;


import java.util.List;
import java.util.Optional;

public interface GenericRepository<E,I> {

    E save(E entity);

    List<E> findAll();

    Optional<E> findById(I id);
}
