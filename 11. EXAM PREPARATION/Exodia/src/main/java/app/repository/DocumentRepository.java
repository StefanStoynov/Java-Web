package app.repository;

import app.domain.entities.Document;

public interface DocumentRepository extends GenericRepository<Document, String>{
    void deleteRepository(String id);
}
