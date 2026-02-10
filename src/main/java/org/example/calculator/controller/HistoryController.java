package org.example.calculator.controller;

import jakarta.servlet.ServletException;
import org.example.calculator.service.HistoryService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/history")
public class HistoryController extends HttpServlet {
    private final HistoryService history = new HistoryService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("history", history.get());
        request.getRequestDispatcher("/pages/history.jsp").forward(request, response);
    }
}
