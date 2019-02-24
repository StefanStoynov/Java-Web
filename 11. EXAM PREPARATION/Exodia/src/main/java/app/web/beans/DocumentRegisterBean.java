package app.web.beans;

import app.domain.models.binding.DocumentRegisterBindingModel;
import app.domain.models.service.DocumentServiceModel;
import app.domain.models.view.DocumentDetailsViewModel;
import app.service.DocumentService;
import org.modelmapper.ModelMapper;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class DocumentRegisterBean {

    private DocumentRegisterBindingModel model;

    private DocumentService documentService;
    private ModelMapper modelMapper;

    public DocumentRegisterBean() {
    }

    @Inject
    public DocumentRegisterBean(DocumentService documentService, ModelMapper modelMapper) {
        this.documentService = documentService;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    public void init(){
        this.model = new DocumentRegisterBindingModel();
    }

    public DocumentRegisterBindingModel getModel() {
        return this.model;
    }

    public void setModel(DocumentRegisterBindingModel model) {
        this.model = model;
    }

    public void register() throws IOException {
        DocumentServiceModel document = this.documentService.registerDocument(this.modelMapper.map(model, DocumentServiceModel.class));
        if (document==null){
            throw new IllegalArgumentException("Something went wrong");
        }
        FacesContext.getCurrentInstance().getExternalContext().redirect("/view/details.jsf"+"?id="+document.getId());
    }
}
