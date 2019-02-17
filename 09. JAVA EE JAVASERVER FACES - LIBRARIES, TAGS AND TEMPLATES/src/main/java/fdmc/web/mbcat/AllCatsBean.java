package fdmc.web.mbcat;

import fdmc.domain.models.view.AllCatsViewModel;
import fdmc.service.CatService;
import org.modelmapper.ModelMapper;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Named
@RequestScoped
public class AllCatsBean {

    private List<AllCatsViewModel> cats = new ArrayList<>();
    private CatService catService;
    private ModelMapper modelMapper;

    public AllCatsBean() {
    }

    @Inject
    public AllCatsBean(CatService catService, ModelMapper modelMapper) {
        this.catService = catService;
        this.modelMapper = modelMapper;
        this.cats = this.catService.findAll()
                .stream()
                .map(c->this.modelMapper.map(c,AllCatsViewModel.class))
                .collect(Collectors.toList());
    }

    public List<AllCatsViewModel> getCats() {
        return Collections.unmodifiableList(this.cats);
    }

    public void setCats(List<AllCatsViewModel> cats) {
        this.cats = cats;
    }
}
