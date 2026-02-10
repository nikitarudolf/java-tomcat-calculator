package org.example.calculator.controller;

import jakarta.servlet.ServletException;
import org.example.calculator.service.CalculatorService;
import org.example.calculator.service.HistoryService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.calculator.dto.CalculationDTO;

import java.io.IOException;

@WebServlet("/calc")
public class CalcController extends HttpServlet {
    private final transient CalculatorService calculator = new CalculatorService();
    private final transient HistoryService history = new HistoryService();
@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double a = Double.parseDouble(request.getParameter("num1"));
        double b = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        double result = calculator.calculate(a, b, operation);
        CalculationDTO calculation = new CalculationDTO(a, b, operation, result);
        history.push(calculation);
        request.setAttribute("lastCalc", calculation);
        request.getRequestDispatcher("/pages/calc.jsp").forward(request, response);
    }
}
