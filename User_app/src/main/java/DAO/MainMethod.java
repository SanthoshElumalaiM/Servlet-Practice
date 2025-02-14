package DAO;

import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		
		User u=new User();
		u.setId(1);
		u.setFirstName("sant");
		u.setLastName("E");
		u.setGender("male");
		u.setEmail("sant@gmail.com");
		u.setPassword("123");
		u.setPhoneNo(19333);
		
		UserDao user=new UserDao();
		try {
//			user.saveUser(u);
//			User u1=user.getById(1);
			List<User> u1=user.fetchAll();
			System.out.println(u1);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
