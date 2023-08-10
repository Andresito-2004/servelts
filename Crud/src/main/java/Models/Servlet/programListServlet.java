package Models.Servlet;

import Models.Beans.Programa;
import Models.RepositoryDAO.ProgramaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name="programListServlet" ,urlPatterns= {"/programListServlet"})
public class programListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Programa> programas = ProgramaDAO.listar();
            request.setAttribute("programas", programas);
            request.getRequestDispatcher("/Programa/ProgramaRead.jsp").forward(request, response);
    }
}
