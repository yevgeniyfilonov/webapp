package fe.controler;

import fe.entity.Articles;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Webcontroller", urlPatterns = {"/article", "/registration"})
public class WebController extends HttpServlet {
    @EJB
    Articles articles;
    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute("articles",articles);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPath = request.getServletPath();
        if ("/article".equals(userPath)) {
            // TODO: обработка запроса статьи
        } else if ("/registration".equals(userPath)) {
            //TODO: обработка запроса регистрации
        }

        request.getRequestDispatcher("/WEB-INF/view" + userPath + ".jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
