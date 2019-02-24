package app.web.beans;

import app.domain.models.view.DocumentDetailsViewModel;
import app.service.DocumentService;
import app.service.UserService;
import org.modelmapper.ModelMapper;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Named
@RequestScoped
public class DocumentPrintBean {

    private DocumentDetailsViewModel model;

    private DocumentService documentService;

    public DocumentPrintBean() {
    }

    @Inject
    public DocumentPrintBean(DocumentService documentService) {
        this.documentService = documentService;
    }

//    private void init() {
//        this.model =this.modelMapper.map(this.documentService.getById(FacesContext
//                .getCurrentInstance()
//                .getExternalContext()
//                .getRequestParameterMap()
//                .get("id")), DocumentDetailsViewModel.class);
//    }

    public DocumentDetailsViewModel getDocument(String id) {
        DocumentDetailsViewModel result = this.documentService.getById(id);
        return result;
    }

//    public DocumentDetailsViewModel getModel() {
//        return this.model;
//    }
//
//    public void setModel(DocumentDetailsViewModel model) {
//        this.model = model;
//    }

    public void print() throws IOException {
        String id = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id");
        this.documentService.delete(id);
        FacesContext.getCurrentInstance().getExternalContext().redirect("/view/home.jsf");
    }

}
