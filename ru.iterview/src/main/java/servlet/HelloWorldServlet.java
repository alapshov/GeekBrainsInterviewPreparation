package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Hello World" + "</h1>");
    }
}