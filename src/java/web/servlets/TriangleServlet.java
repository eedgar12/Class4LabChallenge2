/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eedgar
 */
public class TriangleServlet extends HttpServlet {

    private final Logger logger =
            Logger.getLogger(this.getClass().getName());

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TriangleServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TriangleServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        if ((request.getParameter("side1") != null)
//                || (request.getParameter("side2") != null)
//                || (request.getParameter("hyp") != null)) {
//            request.setAttribute("result", "You must enter two numbers");
//        }
//        if (request.getParameter("side1") != null) {
            double side1 = Double.parseDouble(request.getParameter("side1"));
//
//        }
//        if (request.getParameter("side2") != null) {
            double side2 = Double.parseDouble(request.getParameter("side2"));
//        }
//        if (request.getParameter("hyp") != null) {
//            double hyp = Double.parseDouble(request.getParameter("hyp"));
//        }

        
        double hyp = (Math.sqrt((side1 * side1) + (side2 * side2)));

        String result = "The hypotenuse of the triangle is " + hyp;
        request.setAttribute("triResult", result);
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
        // processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
