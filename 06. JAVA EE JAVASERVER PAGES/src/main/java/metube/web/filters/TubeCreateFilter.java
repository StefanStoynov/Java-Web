package metube.web.filters;

import metube.domain.models.binding.TubeCreateBindingModel;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/tubes/create")
public class TubeCreateFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        if (req.getMethod().toLowerCase().equals("post")){
            TubeCreateBindingModel tubeCreateBindingModel = new TubeCreateBindingModel();

            tubeCreateBindingModel.setName(req.getParameter("name"));
            tubeCreateBindingModel.setDescription(req.getParameter("description"));
            tubeCreateBindingModel.setUploader(req.getParameter("uploader"));
            tubeCreateBindingModel.setYouTubeLink(req.getParameter("youTubeLink"));

            req.setAttribute("model", tubeCreateBindingModel);
        }

        filterChain.doFilter(req,resp);
    }
}
