package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javabeans.User;


public class UserDao {

	private final String URL ="jdbc:postgresql://localhost:5432/sample";
	private final String USER = "postgres";
	private final String PASSWORD = "gi051peq-";

	// 全件取得
	public ArrayList<User> getAllUsers() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		ArrayList<User> users = new ArrayList<>();
		
		User user1 = new User();
		User user2= new User();
		user1.setId(1);
		user1.setName("tanaka");
		user2.setId(2);
		user2.setName("tosiaki");
		
		users.add(user1);
		users.add(user2);
		

//		try {
//			con = DriverManager.getConnection(URL, USER, PASSWORD);
//			String sql = "select * from users";
//			ps = con.prepareStatement(sql);
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//				User user = new User();
//				user.setId(rs.getInt("id"));
//				user.setName(rs.getString("name"));
//				users.add(user);
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				if (rs != null) {
//					rs.close();
//				}
//				if (ps != null) {
//					ps.close();
//				}
//				if (con != null) {
//					con.close();
//				}
//			}
//			catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}

		return users;
	}
}