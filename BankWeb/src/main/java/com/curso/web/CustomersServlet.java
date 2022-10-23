package com.curso.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.curso.domain.Bank;
import com.curso.domain.Customer;

public class CustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomersServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recuperar todos los customers
    	System.out.println("Entro al servlet");
    	List<Customer> lista = new ArrayList();
    	
    	for (int i = 0; i < Bank.getNumOfCustomers(); i++) {
    		 lista.add(Bank.getCustomer(i));
		}
		// añadir el atributo lista con todos los customers a la request
		request.setAttribute("lista", lista);
		
		// despachar la peticion a lista-customers.jsp
		RequestDispatcher rd = request.getRequestDispatcher("lista-customers.jsp");
		rd.forward(request, response);
    }

}
