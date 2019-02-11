package metube.web.filters;

import metube.domain.models.binding.TubeUploadBindingModel;
import metube.domain.models.binding.UserRegisterBindingModel;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/tube/upload")
public class TubeUploadFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        if (req.getMethod().toLowerCase().equals("post")) {
            TubeUploadBindingModel tubm = new TubeUploadBindingModel();
            tubm.setTitle(req.getParameter("title"));
            tubm.setAuthor(req.getParameter("author"));
            tubm.setYoutubeLink(req.getParameter("youtube-link"));
            tubm.setDescription(req.getParameter("description"));
            tubm.setUploader((String) req.getSession().getAttribute("username"));

            req.setAttribute("model", tubm);
        }

        filterChain.doFilter(req, resp);
    }
}
