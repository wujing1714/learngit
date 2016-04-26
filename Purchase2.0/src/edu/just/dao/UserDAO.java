package edu.just.dao;

import edu.just.model.Mixed;
import edu.just.model.User;

public interface UserDAO {
	public Mixed selectUser(String userName);
}
