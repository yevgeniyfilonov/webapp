package util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    String newText;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);not good!!!!!
        req.setCharacterEncoding("UTF-8");
        String text = req.getParameter("text");
        req.setAttribute("text", text);
        req.getRequestDispatcher("/WEB-INF/Result.jsp").forward(req, resp);
        newText = text;
        //System.out.println(newText);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);not use
    }
}

