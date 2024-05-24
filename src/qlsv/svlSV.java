package qlsv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class svlSV
 */
@WebServlet("/svlSV")
public class svlSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlSV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		boolean emp = false;
		
		if("add".equals(action)) {
//			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
//			String parhodemsv=request.getParameter("parhodemsv").trim();
//			String partensv=request.getParameter("partensv").trim();
//			String partelsv=request.getParameter("partelsv").trim();
//			String paremailsv=request.getParameter("paremailsv").trim();
			
			String parmasv=request.getParameter("parmasv");
			if (parmasv != null) {
			    parmasv = parmasv.trim().toUpperCase();
			    System.out.println(parmasv);
			} else {
				emp = true;
			}
			String parhodemsv=request.getParameter("parhodemsv");
			if (parhodemsv != null) {
			    parhodemsv = parhodemsv.trim();
			} else {
				emp = true;
			}
			String partensv=request.getParameter("partensv");
			if (partensv != null) {
			    partensv = partensv.trim();
			} else {
				emp = true;
			}
			String partelsv=request.getParameter("partelsv");
			if (partelsv != null) {
			    partelsv = partelsv.trim();
			} else {
				emp = true;
			}
			String paremailsv=request.getParameter("paremailsv");
			if (paremailsv != null) {
			    paremailsv = paremailsv.trim();
			} else {
				emp = true;
			}
			
			try {
				if((parmasv!=null && parmasv.length()>0) ||(partensv!=null && partensv.length()>0) || (parhodemsv!=null && parhodemsv.length()>0)  ){
					sv svobj = new sv();
					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
					if(parhodemsv!=null && parhodemsv.length()>0) svobj.setHodem(parhodemsv);
					if(partensv!=null && partensv.length()>0) svobj.setTensv(partensv);
					if(partelsv!=null && partelsv.length()>0) svobj.setTelsv(partelsv);//System.out.println("partelsv="+partelsv);
					if(paremailsv!=null && paremailsv.length()>0) svobj.setEmailsv(paremailsv);
					svobj.addSV();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		else if("modify".equals(action)) {
			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
			String parhodemsv=request.getParameter("parhodemsv").trim();
			String partensv=request.getParameter("partensv").trim();
			String partelsv=request.getParameter("partelsv").trim();
			String paremailsv=request.getParameter("paremailsv").trim();
			try {
				if((parmasv!=null && parmasv.length()>0) ||(partensv!=null && partensv.length()>0) || (parhodemsv!=null && parhodemsv.length()>0)  ){
					sv svobj = new sv();
					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
					if(parhodemsv!=null && parhodemsv.length()>0) svobj.setHodem(parhodemsv);
					if(partensv!=null && partensv.length()>0) svobj.setTensv(partensv);
					if(partelsv!=null && partelsv.length()>0) svobj.setTelsv(partelsv);//System.out.println("partelsv="+partelsv);
					if(paremailsv!=null && paremailsv.length()>0) svobj.setEmailsv(paremailsv);
					svobj.upadteSV();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		else if("delete".equals(action)) {
			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
			
			try {
				if((parmasv!=null && parmasv.length()>0)){
					sv svobj = new sv();
					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
					
					svobj.deleteSV();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
