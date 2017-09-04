package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Simple Hello servlet.
 */
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HomePage() {}
	
    /**
     * Respond to a GET request for the content produced by
     * this servlet.
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are producing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
      throws IOException, ServletException {
        
        doPost(request, response);
    }
    
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            		throws IOException, ServletException {
    	
    	request.getRequestDispatcher("/HomePage.jsp").forward(request, response);
    }
}
