package chushka.web.servlets;

import chushka.domain.models.view.ProductDetailsViewModel;
import chushka.service.ProductService;
import chushka.util.ModelMapper;
import chushka.util.ViewsProvider;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products/details")
public class DetailsServlet extends HttpServlet {

    private final ViewsProvider viewsProvider;
    private final ProductService productService;
    private final ModelMapper modelMapper;

    @Inject
    public DetailsServlet(ViewsProvider viewsProvider, ProductService productService, ModelMapper modelMapper) {
        this.viewsProvider = viewsProvider;
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDetailsViewModel productDetailsViewModel = this.modelMapper
                .map(this.productService
                        .findProductByName(req.getQueryString().split("=")[1]), ProductDetailsViewModel.class);
        String htmlFileContent = this.viewsProvider.view("details")
                .replace("{{productName}}", productDetailsViewModel.getName())
                .replace("{{productDescription}}", productDetailsViewModel.getDescription())
                .replace("{{productType}}", productDetailsViewModel.getType());

        resp.getWriter().println(htmlFileContent);
    }
}
