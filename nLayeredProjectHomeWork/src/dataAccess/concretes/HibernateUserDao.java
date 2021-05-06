package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao
{

	@Override
	public void Add(User user) 
	{
		System.out.println("Kay�t sisteme eklendi.");
	}

	@Override
	public void Delete(User user) 
	{
		System.out.println("Kay�t sistemden silindi.");
	}

	@Override
	public void Update(User user) 
	{
		System.out.println("Kay�t g�ncellendi.");
	}

	@Override
	public List<User> getAll() 
	{
		return null;
	}

}
