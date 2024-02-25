package web.servlet;

import core.TestBean;
import core.UserBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "Test",value = "/test2")
public class Test2 extends HttpServlet {
    @EJB(lookup = "java:global/ear-1.0/com.jiat-ejb-1.0/AdminBeanImpl")
    UserBean userBean;
    @EJB
    TestBean testBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test2 User bean hashcode:" + userBean.hashCode() + " - Test bean hashcode:" + testBean.hashCode());
    }
}
