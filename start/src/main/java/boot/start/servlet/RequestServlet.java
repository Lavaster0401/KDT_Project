package boot.start.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "requestServlet", urlPatterns = "/method")
public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //복수 파라미터 값 출력
        String[] userIds = req.getParameterValues("userId");
        for (String userId : userIds) {
                System.out.println("userId = " + userId);
        }
        //단일 파라미터 값 출력
        String userId = req.getParameter("userId");
        System.out.println("userId = " + userId);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---- HTTP POST Method ----");

        String[] names = req.getParameterValues("name");
        if (names != null) {
            for (String name : names) {
                System.out.println("name = " + name);
            }
        } else {
            System.out.println("No name parameters found.");
        }

        String age = req.getParameter("age");
        System.out.println("age = " + age);
    }

}
