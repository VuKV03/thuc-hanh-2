package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.SinhVien;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		// HttpSession session = request.getSession(); 
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
		List<SinhVien> list = dao.getAllStd();
		
		// session.setAttribute("listS", list);
		
		request.setAttribute("listS", list);
		request.getRequestDispatcher("qlsv.jsp").forward(request, response);
		
		
    }
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<SinhVien> list = dao.getAllStd();
		for(SinhVien o : list) {
			System.out.println(o);
		}
	}
	

}
