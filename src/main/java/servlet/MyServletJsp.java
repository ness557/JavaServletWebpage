package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServletJsp extends HttpServlet {

    private int count;

    public void init(ServletConfig config) throws ServletException{
        super.init(config);

        count = 0;

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher view = req.getRequestDispatcher("jsp/mypage.jsp");
        req.setAttribute("count", ++count);
        view.forward(req, resp);
    }




}
