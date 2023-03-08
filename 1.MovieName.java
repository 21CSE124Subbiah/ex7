
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MovieName"})
public class MovieName extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String str = request.getParameter("actor");
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MovieName</title>");
            out.println("</head>");
            out.println("<body>");
            if (str.equals("Surya")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<img src='https://i.pinimg.com/originals/5e/c3/96/5ec3962ea890f31d67b70b49ad759df1.jpg'><br>");
                out.println("<h1>");
                out.println("SURYA <br>");
                out.println("</h1>");
                out.println("Ayan <br>");
                out.println("Athavan <br>");
                out.println("Jaibhim <br>");
                out.println("Anjan <br>");
                out.println("</Center>");
                out.println("</div>");
            }
            if (str.equals("Sivakarthikayan")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<img src='https://cdn.bigstarbio.com/wp-content/uploads/2020/04/Sivakarthikeyan.png?lossy=1&ssl=1'><br>");
                out.println("<h1>");
                out.println("SIVAKARTHIKAYAN <br>");
                out.println("</h1>");
                out.println("Ethirnichal <br>");
                out.println("Remo <br>");
                out.println("Mavitran <br>");
                out.println("Alayan <br>");
                out.println("</Center>");
                out.println("</div>");
            }
            if (str.equals("Simbu")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<img src='https://www.behindwoods.com/tamil-actor/simbu/simbu-stills-photos-pictures-399.jpg'><br>");
                out.println("<h1>");
                out.println("SIMBU <br>");
                out.println("</h1>");
                out.println("Manmathan <br>");
                out.println("Eswaran <br>");
                out.println("Pathu Thala <br>");
                out.println("Manadu <br>");
                out.println("</Center>");
                out.println("</div>");
            }
            if (str.equals("Dhanush")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQw6aKjNqjJyDdcr_-MomSAPulC2Ia2g_M2qw&usqp=CAU'><br>");
                out.println("<h1>");
                out.println("DHANUSH <br>");
                out.println("</h1>");
                out.println("VIP <br>");
                out.println("Vadachennai <br>");
                out.println("Pollathavan <br>");
                out.println("Sullan <br>");
                out.println("</Center>");
                out.println("</div>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
