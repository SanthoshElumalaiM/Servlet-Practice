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
		
		UserDao dao=new UserDao();
		try {
//			dao.saveUser(u);
//			User u1=dao.getById(1);
//			List<User> u1=dao.fetchAll();
//			System.out.println(u1);
			
			User u2= dao.getById(1);
			System.out.println(u2);
			u2.setEmail("santhosh@gmail.com");
			u2.setPhoneNo(637890);
			System.out.println(u2);
			dao.update(u2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
