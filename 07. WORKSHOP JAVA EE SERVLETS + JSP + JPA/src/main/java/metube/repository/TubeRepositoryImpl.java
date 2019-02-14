package metube.repository;

import metube.domain.entities.Tube;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

public class TubeRepositoryImpl implements TubeRepository {

    private final EntityManager entityManager;

    @Inject
    public TubeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
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
        this.entityManager.getTransaction().begin();
        List<Tube> allTubes = this.entityManager
                .createQuery("SELECT t from tubes t", Tube.class)
                .getResultList();
        this.entityManager.getTransaction().commit();
        return allTubes;
    }

    @Override
    public Tube findById(String id) {

        Tube tube = this.entityManager
                .createQuery("SELECT t FROM tubes t WHERE t.id = :id", Tube.class)
                .setParameter("id", id)
                .getSingleResult();

        return tube;
    }

    @Override
    public long size() {
        this.entityManager.getTransaction().begin();
        Long size = this.entityManager
                .createQuery("SELECT count(t) FROM tubes t", long.class)
                .getSingleResult();
        this.entityManager.getTransaction().commit();
        return size;
    }

    @Override
    public Tube update(Tube tube) {
        this.entityManager.merge(tube);
        return tube;
    }
}
