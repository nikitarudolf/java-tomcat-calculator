package Servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form action = '/calc' method = 'post'>");
        out.println("num 1: <input type = 'text' name = 'num1'><br>");
        out.println("num 2: <input type = 'text' name = 'num2'><br>");
        out.println("<select name = 'operation'>");
        out.println("<option value = 'sum'> Sum (+) </option>");
        out.println("<option value = 'sub'> Subtract (-) </option>");
        out.println("<option value = 'mul'> Multiply (*) </option>");
        out.println("<option value = 'div'> Divide (/) </option>");
        out.println("</select>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");
        out.println("<a href=\"/history\">Show history</a>");
        out.println("</body></html>");
    }
}