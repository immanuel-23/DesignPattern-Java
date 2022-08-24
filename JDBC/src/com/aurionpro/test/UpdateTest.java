package com.aurionpro.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/aurionprodb";
			String userName="root";
			String pass="immanuel";
			String query="update employee set e_name='abc' where e_id=7";
			
			Class.forName("com.mysql.cj.jdbc.Driver");// it is used to register 
			Connection con=DriverManager.getConnection(url,userName,pass);// will give instance of connection
			Statement st = con.createStatement();
			int count= st.executeUpdate(query);
//			rs.next();
//			String name=rs.getString("e_name");
//			System.out.println(name);
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
