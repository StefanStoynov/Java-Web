package fdmc.web.mbcat;

import fdmc.domain.models.binding.CatCreateBindingModel;
import fdmc.domain.models.service.CatServiceModel;
import fdmc.service.CatService;
import org.modelmapper.ModelMapper;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class CreateCatBean {

    private  CatCreateBindingModel catCreateBindingModel;
    private ModelMapper modelMapper;
    private CatService catService;

    public CreateCatBean() {
    }

    @Inject
    public CreateCatBean(ModelMapper modelMapper, CatService catService) {
        this.catCreateBindingModel = new CatCreateBindingModel();
        this.modelMapper = modelMapper;
        this.catService = catService;
    }

    public CatCreateBindingModel getCatCreateBindingModel() {
        return this.catCreateBindingModel;
    }

    public void setCatCreateBindingModel(CatCreateBindingModel catCreateBindingModel) {
        this.catCreateBindingModel = catCreateBindingModel;
    }

    public void CreateCat() throws IOException {
        this.catService.saveCat(this.modelMapper.map(this.catCreateBindingModel, CatServiceModel.class));

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.redirect("/");
    }
}
