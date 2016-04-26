package edu.just.service.imp;

import edu.just.dao.UserDAO;
import edu.just.dao.impl.UserDAOImpl;
import edu.just.model.Mixed;
import edu.just.service.UserService;

 

public class UserServiceImpl implements UserService {
	 
	private UserDAO userdao = new UserDAOImpl(); 
	@Override
	public Mixed loginUser(String userName, String passWord) {
		String rs = userdao.selectUser(userName).getOther();
		Mixed mixed = new Mixed();
		mixed.setAuthority(userdao.selectUser(userName).getAuthority());
		
		if(rs.equals("")){
			System.out.println("用户名不存在");
			mixed.setOther("no exit");
			return mixed;
		}
		if(rs.equals(passWord)){
			mixed.setOther("true");
			System.out.println("true");
			return mixed;
		}
		mixed.setOther("false");
		System.out.println("false");
		return mixed;
	}

	 
}
