package backingbeans;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dao.UserDao;
import javabeans.User;

@Named
@RequestScoped
public class UsersBean implements Serializable {

	private ArrayList<User> users;
	
	public UsersBean() {
		UserDao userDao = new UserDao();
		users = userDao.getAllUsers();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

}