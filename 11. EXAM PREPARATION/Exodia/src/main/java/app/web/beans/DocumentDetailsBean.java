package app.web.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;


import app.domain.models.view.DocumentDetailsViewModel;
import app.service.DocumentService;
import org.modelmapper.ModelMapper;

@Named
@RequestScoped
public class DocumentDetailsBean {

    private DocumentDetailsViewModel documentDetailsViewModel;
    private DocumentService documentService;
    private ModelMapper modelMapper;

    public DocumentDetailsBean() {
    }

    @Inject
    public DocumentDetailsBean(DocumentService documentService, ModelMapper modelMapper) {
        this.documentService = documentService;
        this.modelMapper = modelMapper;
        this.init();
    }

    private void init() {
        this.documentDetailsViewModel = this.modelMapper.map(this.documentService.getById(
                FacesContext
                        .getCurrentInstance()
                        .getExternalContext()
                        .getRequestParameterMap()
                        .get("id")), DocumentDetailsViewModel.class);

    }

    public DocumentDetailsViewModel getDocumentDetailsViewModel() {
        return this.documentDetailsViewModel;
    }

    public void setDocumentDetailsViewModel(DocumentDetailsViewModel documentDetailsViewModel) {
        this.documentDetailsViewModel = documentDetailsViewModel;
    }
}
