package util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private String newText;

    public Controller() {
    }

    public String getNewText() {
        return newText;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);not good!!!!!
        req.setCharacterEncoding("UTF-8");
        String text = req.getParameter("text");
        req.setAttribute("text", text);
        newText = text;
        req.getRequestDispatcher("/WEB-INF/Result.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);not use
    }
}

