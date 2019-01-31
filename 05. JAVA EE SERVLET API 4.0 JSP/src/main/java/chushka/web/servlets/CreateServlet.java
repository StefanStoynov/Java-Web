package chushka.web.servlets;

import chushka.domain.entities.Type;
import chushka.domain.models.service.ProductServiceModel;
import chushka.service.ProductService;
import chushka.util.ViewsProvider;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/products/create")
public class CreateServlet extends HttpServlet {
    private final ProductService productService;
    private final ViewsProvider viewsProvider;

    @Inject
    public CreateServlet(ProductService productService, ViewsProvider viewsProvider) {
        this.productService = productService;
        this.viewsProvider = viewsProvider;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String htmlFileContent = this.viewsProvider.view("create-product")
                .replace("{{typeOptions}}",this.formatTypeOptions());

        resp.getWriter().println(htmlFileContent);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductServiceModel productServiceModel = new ProductServiceModel();
        productServiceModel.setName(req.getParameter("name"));
        productServiceModel.setDescription(req.getParameter("description"));
        productServiceModel.setType(req.getParameter("type"));

        this.productService.saveProduct(productServiceModel);

        resp.sendRedirect("/");
    }

    private String formatTypeOptions(){
        StringBuilder types = new StringBuilder();

        Arrays.stream(Type.values()).forEach(value->{
            types
                    .append(String.format("<option value=\"%s\">%s</option>",value.name(),value.name()))
                    .append(System.lineSeparator());
        });
        return types.toString().trim();
    }
}
