package com.jsp.dao;
import java.sql.*;
import com.jsp.DTO.Employee;

public class EmployeeDao 
{
	public Connection establishCon() throws  Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/vishal","root","root");
       return c;
		
	}
	public void insertEmployee(Employee e) throws Exception
	{
		int id =e.getId();
		String name=e.getName();
		int salary=e.getSalary();
		
		Connection c=establishCon();
		 
		PreparedStatement ps= c.prepareStatement("insert into new_table values(?,?,?)");
		ps.setInt(1, e.getId());
		ps.setString(2,e.getName());
		ps.setInt(3, e.getSalary());
		ps.execute();
		c.close();
		
	}
	public void updateEmployee(Employee e) throws Exception
	{
		Connection c=establishCon();
		 
		PreparedStatement ps= c.prepareStatement("update new_table set name=? where id=?");
		ps.setString(1, e.getName());
		ps.setInt(2, e.getId());
		ps.executeUpdate();
		c.close();
		
	}
	public void selectEmployee(Employee e) throws Exception
	{
		Connection c=establishCon();
		 
		PreparedStatement ps= c.prepareStatement("select * from  new_table");
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		c.close();
		
	}
	public void deleteEmployee(Employee e) throws Exception
	{
		Connection c=establishCon();
		 
		PreparedStatement ps= c.prepareStatement("delete from new_table where id=?");
		ps.setInt(1, e.getId());
		ps.executeUpdate();
		c.close();
		
	}
	public void showIdEmployee(int id ,String name) throws Exception
	
	{
		Connection c=establishCon(); 
		PreparedStatement ps= c.prepareStatement("select * from  new_table where id =? and name=?");
		ps.setInt(1,id);
		ps.setString(2,name);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		c.close();
		
		
		
		
	}

}
