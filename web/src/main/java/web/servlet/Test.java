package web.servlet;

import core.UserBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "Test",value = "/test")
public class Test extends HttpServlet {
    @EJB(lookup = "java:global/ear-1.0/com.jiat-ejb-1.0/AdminBeanImpl")
    UserBean userBean;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("Hello test servlet");
        String s = userBean.getDetails();
        resp.getWriter().write(s);
    }
}
