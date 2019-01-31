/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modules.EJBDemoBeanLocal;

/**
 *
 * @author Victor.Malmygin
 */
public class AuthServlet extends HttpServlet {
    
    @EJB
    private EJBDemoBeanLocal bean;
    
//    private int count;
    
//    public void init(){
//        count = 0;
//        ServletConfig sc = getServletConfig();
//        Enumeration e = sc.getInitParameterNames();
//        while(e.hasMoreElements()){
//            String name = (String)e.nextElement();
//            String value = sc.getInitParameter(name);
//        }
//    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Map<String,String[]> map = request.getParameterMap();
        Enumeration<String> names = request.getParameterNames();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Auth</title>");            
            out.println("</head>");
            out.println("<body>");
//            for (Entry entry : map.entrySet()){
//                out.println(entry.getKey() + " " + ((String[])entry.getValue())[0] + "<br>");
//            }
            
//            while(names.hasMoreElements()){
//                if (names.nextElement().equals("getAcc")){
//                    bean.login(request.getParameter("login"), request.getParameter("psw"));
//                }
//                if (names.nextElement().equals("getMsg")){
//                    out.println("<h1>" + bean.getMessage(request.getParameter("login")) + "</h1>");
//                }
//            }

            if(request.getParameter("req").equals("login")){
                if(bean.login(request.getParameter("login"), request.getParameter("psw"))){
                    out.println("true");
                    request.getRequestDispatcher("authorized.html").forward(request, response);
                }else{
                    out.println("false");
                    request.getRequestDispatcher("index.html").forward(request, response);
                }
            }
            
            if(request.getParameter("req").equals("getMessage")){
                out.println("<h1>" + bean.getMessage(request.getParameter("login")) + "</h1>");
                
                
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
