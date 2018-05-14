package servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        PrintWriter out = resp.getWriter();
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<h1>Hello Servlet Get</h1>");
//        out.println("</body>");
//        out.println("</html>");
        RequestDispatcher view = req.getRequestDispatcher("html/mypage.html");
        view.forward(req, resp);
    }
}
