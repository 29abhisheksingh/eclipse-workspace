package com.globallogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/buddy";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
			String insertQuery="insert into Employee(Empid,Sal,Dept,fname) values (5,300,5,'puja')";
			st.execute(insertQuery);

			/*//update query starts
			
			//delete query starts
			String deleteQuery="delete from employee where id=9";
			st.executeUpdate(deleteQuery);
			
			//delete query ends
			
			
			String updateQuery="update employee set salary=50001 where id=9";
			st.executeUpdate(updateQuery);
			
			//update query ends
			/*
			*/
			// Select using executeQuery
						String query = "select * from employee";
						
						ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				//rs.getint() 
				    //pass the index 
				    //pass the columnname
				System.out.println("id : "+" "+rs.getInt("Empid") +" fname : "+rs.getString(4) +" Sal :  "+rs.getInt(2) +" Dept : "+rs.getInt(3));
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
