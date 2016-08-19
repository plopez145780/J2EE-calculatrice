package fr.plopez.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.plopez.beans.Calcul;

/**
 * Servlet implementation class Calculatrice
 */
@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double nombre1 = 0;
		double nombre2 = 0;
		try{
			nombre1 = Double.parseDouble(request.getParameter("nombre1"));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		
		try{
			nombre2 = Double.parseDouble(request.getParameter("nombre2"));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		 
		String formule = (String)request.getParameter("formule");
		Calcul calcul = new Calcul(nombre1,nombre2, formule);
		
		request.setAttribute("calcul", calcul);
		
		doGet(request, response);
		
	}

}
