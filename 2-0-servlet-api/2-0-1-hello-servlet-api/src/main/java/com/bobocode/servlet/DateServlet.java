package com.bobocode.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

/**
 * A servlet that returns the current date.
 */
@WebServlet("/date")
public class DateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        LocalDate currentDate = LocalDate.now();

        out.println("<html><body align=\"center\">");
        out.println("<h1>" + "Current Date: " + currentDate + "</h1>");
        out.println("</body></html>");
    }
}

