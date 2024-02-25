package web.servlet;

import core.Account;
import core.TestBean;
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

    @EJB
    Account account;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        account.deposit(1000);
        resp.getWriter().print("Balance : " + account.getBalance());
    }
}
