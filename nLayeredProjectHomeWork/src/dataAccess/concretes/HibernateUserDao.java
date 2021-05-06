package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao
{

	@Override
	public void Add(User user) 
	{
		System.out.println("Kayýt sisteme eklendi.");
	}

	@Override
	public void Delete(User user) 
	{
		System.out.println("Kayýt sistemden silindi.");
	}

	@Override
	public void Update(User user) 
	{
		System.out.println("Kayýt güncellendi.");
	}

	@Override
	public List<User> getAll() 
	{
		return null;
	}

}
