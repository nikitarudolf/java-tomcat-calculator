package Servlets;

import Services.CalculatorService;
import Services.HistoryService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.demo1.Calculation;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    private final CalculatorService calculator = new CalculatorService();
    private final HistoryService history = new HistoryService();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double a = Double.parseDouble(request.getParameter("num1"));
        double b = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        double result = calculator.calculate(a, b, operation);
        history.addToHistory(request.getSession(), new Calculation(a, b, operation, result));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("num 1: " + a + "<br>");
        out.println("num 2: " + b + "<br>");
        out.println("operation: " + operation + "<br>");
        out.println("result: " + result + "<br>");
        out.println("<a href=\"/\">Back</a>");
        out.println("</body></html>");

    }
}
