package com.aurionpro.test;
import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/aurionprodb";
			String userName="root";
			String pass="immanuel";
			String query="select e_name from employee where e_id=3";
			
			Class.forName("com.mysql.cj.jdbc.Driver");// it is used to register 
			Connection con=DriverManager.getConnection(url,userName,pass);// will give instance of connection
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString("e_name");
			System.out.println(name);
			
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstmt.setInt(1, 20);
		
			pstmt.setString(2, "Ajay");
			pstmt.setString(3, "Chennai");
			pstmt.setString(4, "clerk");
			pstmt.setInt(5,25);
			
			pstmt.execute();
			
			st.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
