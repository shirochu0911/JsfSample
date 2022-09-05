package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javabeans.User;


public class UserDao {

	private final String URL ="jdbc:postgresql://localhost:5432/sample";
	private final String USER = "postgres";
	private final String PASSWORD = "P@ssw0rd";

	// 全件取得
	public ArrayList<User> getAllUsers() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		ArrayList<User> users = new ArrayList<>();
		

		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "select * from users";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				users.add(user);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
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

		return users;
	}
}