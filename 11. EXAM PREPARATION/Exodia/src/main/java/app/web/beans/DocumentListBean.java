package app.web.beans;

import app.domain.models.view.DocumentDetailsViewModel;
import app.service.DocumentService;
import org.modelmapper.ModelMapper;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class DocumentListBean {

    private List<DocumentDetailsViewModel> models;

    private ModelMapper modelMapper;
    private DocumentService documentService;

    public DocumentListBean() {
    }

    @Inject
    public DocumentListBean(ModelMapper modelMapper, DocumentService documentService) {
        this.modelMapper = modelMapper;
        this.documentService = documentService;
        this.init();
    }

    private void init() {
        this.models = this.documentService.getAll();
    }

    public List<DocumentDetailsViewModel> getModels() {
        return this.models;
    }

    public void setModels(List<DocumentDetailsViewModel> models) {
        this.models = models;
    }
}
