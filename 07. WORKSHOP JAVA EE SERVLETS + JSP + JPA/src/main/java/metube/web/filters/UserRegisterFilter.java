package metube.web.filters;

import metube.domain.models.binding.UserRegisterBindingModel;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/register")
public class UserRegisterFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        if (req.getMethod().toLowerCase().equals("post")) {
            UserRegisterBindingModel urbm = new UserRegisterBindingModel();
            urbm.setUsername(req.getParameter("username"));
            urbm.setPassword(req.getParameter("password"));
            urbm.setConfirmPassword(req.getParameter("confirmPassword"));
            urbm.setEmail(req.getParameter("email"));

            req.setAttribute("model", urbm);
        }

        filterChain.doFilter(req, resp);
    }
}
