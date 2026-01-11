package Servlets;

import Services.HistoryService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {
    private final HistoryService history = new HistoryService();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String jsonHistory = gson.toJson(history.getHistory(request.getSession()));
        out.println("<h3>History:</h3>");
        out.println("<pre>" + jsonHistory + "</pre>");
        out.println("<a href=\"/\">Back</a>");
    }
}
