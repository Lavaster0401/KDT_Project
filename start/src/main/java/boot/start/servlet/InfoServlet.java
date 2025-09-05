package boot.start.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "infoServlet", urlPatterns = "/info")
public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 요청 메서드 출력 (GET, POST, PUT, DELETE 등의 HTTP 메서드 확인)
        System.out.println("Request Method: " + req.getMethod());

        // 요청 URL 정보 출력 (전체 URL을 반환, 프로토콜부터 서버명, 포트, URI까지 모두 포함)
        System.out.println("Request URL: " + req.getRequestURL().toString());
        // 요청 URI 정보 출력 (요청된 리소스의 경로만 반환, URL에서 도메인 및 프로토콜을 제외한 부분)
        System.out.println("Request URI: " + req.getRequestURI());
        //
        System.out.println("Request Path: " + req.getContextPath());
        System.out.println("Request Path: " + req.getServletPath());
        // 쿼리 스트링 출력 (URL 뒤에 붙은 파라미터 값을 반환, 예: ?user=abc에서 "user=abc" 반환)
        System.out.println("Query String: " + req.getQueryString());
        // 프로토콜 버전 출력 (요청에서 사용된 HTTP 프로토콜 버전을 반환, 예: HTTP/1.1)
        System.out.println("Protocol: " + req.getProtocol());

        // 요청 헤더 정보 출력
        System.out.println("---- Headers ----");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = req.getHeader(headerName);
            System.out.println(headerName + ": " + headerValue);
        }
    }

}
