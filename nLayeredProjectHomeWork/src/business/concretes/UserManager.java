package business.concretes;

import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.MailService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService
{
	private UserDao userDao;
	private ValidationService validationService;
	private MailService mailService;
	private AuthService authService;
	public UserManager(UserDao userDao,ValidationService validationService,
			MailService mailService,AuthService authService) 
	{
		this.userDao=userDao;
		this.validationService=validationService;
		this.mailService=mailService;
		this.authService=authService;
	}
	@Override
	public void Add(User user) 
	{
		if(validationService.verify(user)) 
		{
			userDao.Add(user);
			mailService.Send(user);
			authService.Login(user);
		}
		else 
		{
			System.out.println("Kayýt Yapýlamadý.");
		}
	}

	@Override
	public void Delete(User user) 
	{
		userDao.Delete(user);
	}

	@Override
	public void Update(User user) 
	{
		userDao.Update(user);
	}

	@Override
	public List<User> getAll() 
	{
		return userDao.getAll();
	}
	
}
