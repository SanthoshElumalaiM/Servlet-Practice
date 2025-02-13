package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.mysql.cj.xdevapi.Result;

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
			
			return u;
		}
		else {
			return null;
		}
	}

}
