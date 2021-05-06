package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao 
{
	void Add(User user);
	void Delete(User user);
	void Update(User user);
	List<User> getAll();
}
