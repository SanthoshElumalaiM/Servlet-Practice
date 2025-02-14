package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	static String Driver="com.mysql.cj.jdbc.Driver";
	static String Url="jdbc:mysql://localhost:3306/user_db?user=root&password=root";
	Connection c=null;	
	public void saveUser(User u)throws Exception
	{
		Class.forName(Driver);
		c=DriverManager.getConnection(Url);
		PreparedStatement ps=c.prepareStatement("insert into user value(?,?,?,?,?,?,?)");
		ps.setInt(1, u.getId());
		ps.setString(2, u.getFirstName());
		ps.setString(3, u.getLastName());
		ps.setString(4, u.getGender());
		ps.setString(5, u.getEmail());
		ps.setString(6,u.getPassword());
		ps.setLong(7, u.getPhoneNo());
		ps.executeUpdate();
		c.close();
		
		
	}
	public void deleById(int id)throws Exception
	{
		Class.forName(Driver);
		c=DriverManager.getConnection(Url);
		PreparedStatement ps=c.prepareStatement("delete from user where id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		c.close();
	}
	public User getById(int id)throws Exception
	{
		Class.forName(Driver);
		c=DriverManager.getConnection(Url);
		PreparedStatement ps=c.prepareStatement("select * from user where id=?");
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next())
		{
			String fname =rs.getString("firstName");
			String lname =rs.getString("LastName");
			String gender =rs.getString("gender");
			String email=rs.getString("email");
			String password=rs.getString("password");
			Long phoneNo=rs.getLong("phoneNo");
			
			User u=new User();
			u.setFirstName(fname);
			u.setLastName(lname);
			u.setGender(gender);
			u.setEmail(email);
			u.setPassword(password);
			u.setPhoneNo(phoneNo);
			u.setId(id);
			
			return u;
		}
		else {
			return null;
		}
	}
	public User getByEmail(String email)throws Exception
	{
		Class.forName(Driver);
		c=DriverManager.getConnection(Url);
		PreparedStatement ps=c.prepareStatement("select * from user where email=?");
		ps.setString(1, email);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next())
		{	
			int id=rs.getInt("id");
			String fname =rs.getString("firstName");
			String lname =rs.getString("LastName");
			String gender =rs.getString("gender");
			String password=rs.getString("password");
			Long phoneNo=rs.getLong("phoneNo");
			
			User u=new User();
			u.setId(id);
			u.setFirstName(fname);
			u.setLastName(lname);
			u.setGender(gender);
			u.setEmail(email);
		
			u.setPassword(password);
			u.setPhoneNo(phoneNo);
			
			return u;
		}
		else {
			return null;
		}
	}
	public List<User> fetchAll()throws Exception
	{
		Class.forName(Driver);
		c=DriverManager.getConnection(Url);
		Statement s=c.createStatement();
		ResultSet rs= s.executeQuery("select * from user ");
		List<User> al=new ArrayList<User>();
		
		
		
		while(rs.next())
		{
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setFirstName(rs.getString("firstName"));
			u.setLastName(rs.getString("lastName"));
			u.setGender(rs.getString("gender"));
			u.setEmail(rs.getString("email"));
			u.setPassword(rs.getString("password"));
			u.setPhoneNo(rs.getLong("phoneNO"));
			
			
			al.add(u);
			
			
		}
		
		return al;
	}
	
	public void update(User u)throws Exception
	{
		Class.forName(Driver);
		c=DriverManager.getConnection(Url);
		PreparedStatement ps=c.prepareStatement("update user set firstName=?,lastName=?,gender=?,email=?,password=?,phoneNo=? where id=?");
		
		ps.setString(1, u.getFirstName());
		ps.setString(2, u.getLastName());
		ps.setString(3, u.getGender());
		ps.setString(4, u.getEmail());
		ps.setString(5,u.getPassword());
		ps.setLong(6,u.getPhoneNo());
		ps.setInt(7,u.getId());
		ps.executeUpdate();
		c.close();
		System.out.println("data saved");
	}
	
}
