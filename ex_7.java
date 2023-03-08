/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.objects.NativeFunction.function;

/**
 *
 * @author csesu
 */
@WebServlet(urlPatterns = {"/ex_7"})
public class ex_7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String s1 = request.getParameter("question");
            String s2 = request.getParameter("answer1");
            String s3 = request.getParameter("answer2");
            String s4 = request.getParameter("answer3");
            String s5 = request.getParameter("answer4");
            String s6 = request.getParameter("correctanswer");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ex_7</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            //out.println("<form>");
            out.println("question 1");
            out.println(s1);
            out.println("<br>");
            out.println("<input type='radio' name='ans'>");
            out.print("Option1" + " " + s2);
            out.println("<br>");
            out.println("<input type='radio' name='ans'>");
            out.print("Option2" + " " + s3);
            out.println("<br>");
            out.println("<input type='radio' name='ans'>");
            out.print("Option3" + " " + s4);
            out.println("<br>");
            out.println("<input type='radio' name='ans'>");
            out.print("Option4" + " " + s5);
            out.println("<br>");
            out.println("<input type='submit' value='submit'>");
           // out.println("</form>");
           
            String s7=request.getParameter("ans");
            out.print(s7);
           if (s6.equals(s7)) {
                out.println("correct <br>");
           }
           else {
                out.println("Wrong <br>");
            }
           
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
