package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javabeans.Memory;

public class ParrotDao {
	private final String URL ="jdbc:postgresql://localhost:5432/sample";
	private final String USER = "testuser";
	private final String PASSWORD = "P@ssw0rd";
	
	//入力値登録
	public void insertWord() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		String sql = "Insert into parrotMemory values ('tanaka');";
		
	}

	// 全件取得
	public ArrayList<Memory> getAllParrotMemory() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		ArrayList<Memory> memoryList = new ArrayList<>();
		

		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "select * from parrotMemory";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Memory memory = new Memory();
				
				memory.setWord(rs.getString("word"));
				memory.setCreateDate(rs.getTimestamp("createDate"));
				memoryList.add(memory);

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

		return memoryList;
	}
}
