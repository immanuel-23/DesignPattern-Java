package com.aurionpro.test;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QueriesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/ORGANIZATION";
		String userName = "root";
		String pass = "immanuel";
		String query = "select * from emp";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, pass);// will give instance of connection
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			System.out.println(" 1) DISPLAYING ALL EMPLOYEE");
			while (rs.next()) {
				System.out.println("EMP NAME :" + rs.getString("ENAME") + "    |    " + "EMPNO: "
						+ rs.getString("EMPNO") + "    |    " + " EMPJOB: " + rs.getString("JOB") + "    |     "
						+ "HIREDATE: " + rs.getString("HIREDATE") + "    |    " + "SALARY :" + rs.getString("SAL")
						+ "    |     " + "MGR:" + rs.getString("MGR") + "   |   " + "DEPTNO:" + rs.getString("DEPTNO"));
			}
			System.out.println(
					"_____________________________________________________________________________________________________________________________");
			System.out.println("2) Employee name in ASCENDING ORDER");
			String query1 = "select ENAME from emp order by ENAME";
			rs = st.executeQuery(query1);
			while (rs.next()) {
				System.out.println("EMP NAME :"+rs.getString("ENAME"));
			}
			System.out.println(
					"_____________________________________________________________________________________________________________________________");
			System.out.println("3) Details of all employe with department no 20 and 30");
			String query2 = "select * from emp where DEPTNO=20 or DEPTNO=30";
			rs = st.executeQuery(query2);
			while (rs.next()) {
				System.out.println("EMP NAME :" + rs.getString("ENAME") + "    |    " + "EMPNO: "
						+ rs.getString("EMPNO") + "    |    " + " EMPJOB: " + rs.getString("JOB") + "    |     "
						+ "HIREDATE: " + rs.getString("HIREDATE") + "    |    " + "SALARY :" + rs.getString("SAL")
						+ "    |     " + "MGR:" + rs.getString("MGR") + "   |   " + "DEPTNO:" + rs.getString("DEPTNO"));
			}
			System.out.println(
					"_____________________________________________________________________________________________________________________________");
			System.out.println("4) Displaying details of all employee with JOB=MANANGER");
			String query3 = "select * from emp where JOB='manager'";
			rs = st.executeQuery(query3);
			while (rs.next()) {
				System.out.println("EMP NAME :" + rs.getString("ENAME") + "    |    " + "EMPNO: "
						+ rs.getString("EMPNO") + "    |    " + " EMPJOB: " + rs.getString("JOB") + "    |     "
						+ "HIREDATE: " + rs.getString("HIREDATE") + "    |    " + "SALARY :" + rs.getString("SAL")
						+ "    |     " + "MGR:" + rs.getString("MGR") + "   |   " + "DEPTNO:" + rs.getString("DEPTNO"));
			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println("5) DISPLAYING DETAILS OF EMPLOYEE WHERE SALARY IS BETWEEN 2000 AND 5000");
			String query4 = "select * from emp where SAL>=2000 AND SAL<=5000";
			rs = st.executeQuery(query4);
			while (rs.next()) {
				System.out.println("EMP NAME :" + rs.getString("ENAME") + "    |    " + "EMPNO: "
						+ rs.getString("EMPNO") + "    |    " + " EMPJOB: " + rs.getString("JOB") + "    |     "
						+ "HIREDATE: " + rs.getString("HIREDATE") + "    |    " + "SALARY :" + rs.getString("SAL")
						+ "    |     " + "MGR:" + rs.getString("MGR") + "   |   " + "DEPTNO:" + rs.getString("DEPTNO"));
			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println("6) Displaying details of employee with COMMISION  = NULL");
			String query5 = "Select * from emp where comm= 20";
			rs = st.executeQuery(query5);
			
			while (rs.next()) {
				System.out.println("EMP NAME :" + rs.getString("ENAME") + "    |    " + "EMPNO: "
						+ rs.getString("EMPNO") + "    |    " + " EMPJOB: " + rs.getString("JOB") + "    |     "
						+ "HIREDATE: " + rs.getString("HIREDATE") + "    |    " + "SALARY :" + rs.getString("SAL")
						+ "    |     " + "MGR:" + rs.getString("MGR") + "   |   " + "DEPTNO:" + rs.getString("DEPTNO"));

			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println("7) Displaying name of all the employe whoes name start with S");
			
			String query6="select * from emp where ENAME LIKE'S%'";
			rs=st.executeQuery(query6);
			while(rs.next()) {
				System.out.println("EMP NAME WITH S:"+rs.getString("ENAME"));
			}
			
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println("8) Displaying all employee name in lower case");
			String query7="select LOWER(ENAME) AS ENAME FROM EMP";
			rs=st.executeQuery(query7);
			while(rs.next()) {
				System.out.println("ENAME :"+rs.getString("ENAME"));
			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println("9) Dispalying all JOB IN LOWER CASE");
			String query8="select LOWER(JOB) AS JOB FROM EMP";
			rs=st.executeQuery(query8);
			while(rs.next()) {
				System.out.println("JOB :"+rs.getString("JOB"));
			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println("10) DISPLAYING ALL UNIQUE DEPARTMENT FROM EMP TABLE");
			String query9="select DISTINCT DEPTNO FROM EMP";
			rs= st.executeQuery(query9);
			while(rs.next()) {
				System.out.println("DISTINCT DEPARTMENT NO :"+rs.getString("DEPTNO"));
			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			String query10=" Select sal, ENAME ,comm from emp";
			System.out.println("11 )CTC OF EACH EMPLOYE IS ");
			rs=st.executeQuery(query10);
			double ctc;
			while(rs.next()) {
				ctc=Double.parseDouble(rs.getString("SAL"));
				System.out.println("ENAME: "+rs.getString("ENAME")+" CTC : "+ctc*12);
			}
			System.out.println(
					"______________________________________________________________________________________________________________________________");
			System.out.println(" 12 )DISPLAYING HIRE AND CURRENT DATE");
			String query11="Select HIREDATE,ENAME FROM EMP ";
			rs=st.executeQuery(query11);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			   LocalDate now = LocalDate.now();
			while(rs.next()) {
				System.out.println("ENAME :"+rs.getString("ENAME")+" |    HIRE DATE: "+rs.getString("HIREDATE")+"    |  CURRENT Date "+now );
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // it is used to register
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
