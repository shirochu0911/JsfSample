package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloDao {
	
	private final String URL ="jdbc:postgresql://localhost:5432/sample";
	private final String USER = "postgres";
	private final String PASSWORD = "gi051peq-";
	//入力値登録
	public void insertWord(String word) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		System.out.println("修正後");
		
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		String sql = "Insert into parrotMemory values ('"+word+"');";
		
		ps = con.prepareStatement(sql);
		
		
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			
	}
}
