package app.service;

import app.domain.entities.Document;
import app.domain.models.service.DocumentServiceModel;
import app.domain.models.view.DocumentDetailsViewModel;
import app.repository.DocumentRepository;
import org.modelmapper.ModelMapper;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final ModelMapper modelMapper;

    @Inject
    public DocumentServiceImpl(DocumentRepository documentRepository, ModelMapper modelMapper) {
        this.documentRepository = documentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public DocumentServiceModel registerDocument(DocumentServiceModel documentServiceModel) {

        Document document = this.modelMapper.map(documentServiceModel, Document.class);

        if (this.documentRepository.save(document) == null) {
            return null;
        }

        return this.modelMapper.map(document, DocumentServiceModel.class);
    }

    @Override
    public DocumentDetailsViewModel getById(String id) {
        DocumentDetailsViewModel document = this.modelMapper.map(this.documentRepository.findById(id), DocumentDetailsViewModel.class);
        if (document == null){
            return null;
        }
        return document;
    }

    @Override
    public List<DocumentDetailsViewModel> getAll() {

        List<Document> documents = this.documentRepository.findAll();
        List<DocumentDetailsViewModel> models = documents
                .stream()
                .map(document -> this.modelMapper.map(document, DocumentDetailsViewModel.class))
                .collect(Collectors.toList());
        return models;
    }

    @Override
    public void delete(String id) {
        this.documentRepository.deleteRepository(id);
    }
}
