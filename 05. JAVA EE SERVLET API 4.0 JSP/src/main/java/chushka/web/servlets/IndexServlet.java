package chushka.web.servlets;

import chushka.domain.models.view.AllProductsViewModel;
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
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/")
public class IndexServlet extends HttpServlet {
    private final ProductService productService;
    private final ViewsProvider viewsProvider;
    private final ModelMapper modelMapper;

    @Inject
    public IndexServlet(ProductService productService, ViewsProvider viewsProvider, ModelMapper modelMapper) {
        this.productService = productService;
        this.viewsProvider = viewsProvider;
        this.modelMapper = modelMapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String htmlContent = this.viewsProvider
                .view("index")
                .replace("{{listItems}}", this.formatListItems());

        resp.getWriter().println(htmlContent);
    }

    private String formatListItems() {
        List<AllProductsViewModel> allProducts = this.productService.findAllProducts()
                .stream()
                .map(productServiceModel -> this.modelMapper.map(productServiceModel, AllProductsViewModel.class))
                .collect(Collectors.toList());

        StringBuilder listItems = new StringBuilder();
        allProducts.stream().forEach(product -> {
            listItems.append(String.format("<li><a href=\"/products/details?name=%s\">%s</a></li>",product.getName(),product.getName()))
                    .append(System.lineSeparator());
        });
        return listItems.toString().trim();
    }

}
