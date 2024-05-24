package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.SinhVien;

public class DAO {
	Connection conn = null; // Kết nối mySql
	PreparedStatement ps = null; // Gửi lệnh sql sang mySql
	ResultSet rs = null; // Nhận kết quả trả về
	
	public List<SinhVien> getAllStd() {
		List<SinhVien> list = new ArrayList<>();
		String query = "SELECT * FROM `sv` ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl="jdbc:mysql://localhost:3306/qlsv"; // MySQL
            String username="root"; 	
            String userpass="root";
            
            conn = DriverManager.getConnection(dburl, username, userpass);
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
            	list.add(new SinhVien(rs.getString(1),
            			rs.getString(2),
            			rs.getString(3),
            			rs.getString(4),
            			rs.getString(5)));
            }
		} catch (Exception e) {
			
         }
		
		return list;		
	}
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<SinhVien> list = dao.getAllStd();
		for(SinhVien o : list) {
			System.out.println(o);
		}
	}
}
