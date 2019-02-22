package app.repository;

import app.domain.entities.Job;

public interface JobRepository extends GenericRepository<Job, String> {
    void delete(String id);
}
