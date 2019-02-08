package metube.repositories;

import metube.domain.entities.Tube;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class TubeRepositoryImpl implements TubeRepository {

    private EntityManager entityManager;

    public TubeRepositoryImpl() {
        this.entityManager = Persistence
                .createEntityManagerFactory("metube")
                .createEntityManager();
    }

    @Override
    public Optional<Tube> findByName(String name) {
        try {
            Optional<Tube> tube = Optional.of(
                    this.entityManager.createQuery("SELECT t FROM tubes t WHERE t.name = :name", Tube.class)
                            .setParameter("name", name)
                            .getSingleResult()
            );
            return tube;
        }catch (NoResultException nre){
            return Optional.empty();
        }

    }

    @Override
    public Tube save(Tube entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(entity);
        this.entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public List<Tube> findAll() {
        return this.entityManager.createQuery("SELECT t FROM tubes t", Tube.class).getResultList();

    }

    @Override
    public Optional<Tube> findById(String id) {
        try{
            Optional<Tube> tube = Optional.of(
                    this.entityManager.createQuery("SELECT t FROM tubes t WHERE t.id = :id", Tube.class)
                            .setParameter("id", id)
                            .getSingleResult()
            );
            return tube;
        }catch (NoResultException nre){
            return Optional.empty();
        }

    }
}
