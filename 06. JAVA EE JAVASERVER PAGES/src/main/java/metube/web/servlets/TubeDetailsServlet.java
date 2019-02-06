package metube.web.servlets;

import metube.domain.models.view.TubeDetailsViewModel;
import metube.services.TubeService;
import metube.util.ModelMapper;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

@WebServlet("/tubes/details")
public class TubeDetailsServlet extends HttpServlet {

    private final TubeService tubeService;
    private final ModelMapper mapper;

    @Inject
    public TubeDetailsServlet(TubeService tubeService, ModelMapper mapper) {
        this.tubeService = tubeService;
        this.mapper = mapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = URLDecoder.decode(req.getQueryString().split("=")[1], "UTF-8");

        req.setAttribute("tubeDetailsViewModel",
                this.mapper.map(this.tubeService.findTybeByName(name),TubeDetailsViewModel.class));

        req.getRequestDispatcher("/jsps/details-tube.jsp").forward(req,resp);
    }
}
