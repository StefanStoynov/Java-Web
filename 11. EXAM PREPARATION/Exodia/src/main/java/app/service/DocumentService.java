package app.service;

import app.domain.models.service.DocumentServiceModel;
import app.domain.models.view.DocumentDetailsViewModel;

import java.util.List;

public interface DocumentService {
    DocumentServiceModel registerDocument(DocumentServiceModel documentServiceModel);

    DocumentDetailsViewModel getById(String id);

    List<DocumentDetailsViewModel> getAll();

    void delete(String id);
}
