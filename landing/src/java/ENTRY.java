/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Divyanshu
 */
public class ENTRY extends HttpServlet {
    
    @Override   
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
       placio p1 = new placio();
        Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	session.persist(p1);
        p1.setName(request.getParameter("fname"));
        p1.setName2(request.getParameter("fname2"));
	t.commit();
        session.flush();
	session.close();
         RequestDispatcher r1 = request.getRequestDispatcher("index.html");
         r1.forward(request, response);
}
}
