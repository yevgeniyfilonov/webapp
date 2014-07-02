package fe.sevlet;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloTomcat extends HttpServlet {
    private static final Logger log = Logger.getLogger(HelloTomcat.class);

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Ghbdfjghjuer</h1>");


    }
}
