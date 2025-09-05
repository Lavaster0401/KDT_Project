package boot.start.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


//name은 서블릿의 이름 urlPatterns는 어떤 url로 요청이 들어왔을 때 서블릿이 실행되게 할지 설정
@WebServlet(name = "serveletInitServelet", urlPatterns = "/request")
// extends HttpServlet -> 서블릿 클래스를 만들때 무조건 사용해야 함 (여러가지 기능이 정의되어 있는 클래스)
public class ServeletInit extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        System.out.println("request");
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
