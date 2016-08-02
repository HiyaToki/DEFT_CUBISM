package edu.albany.cubism.sentiment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	private final String dataurl = "jdbc:mysql://cycles.ss.albany.edu/metaphor_repository?useUnicode=true&characterEncoding=utf-8";
	private final String user = "anassman";
	private final String password = "D0samrD9";
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con=DriverManager.getConnection(dataurl, user, password);
		return con;
	}
	
	public boolean Update(String query, Object... params){
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			int p = 1;
			for( Object param :params){
				ps.setObject(p++, param);
			}
			ps.executeUpdate();	
			ps.close();
			con.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 return false;
	}
	


}
