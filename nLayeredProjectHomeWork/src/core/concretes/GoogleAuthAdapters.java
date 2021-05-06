package core.concretes;

import core.abstracts.GoogleAuthService;
import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class GoogleAuthAdapters implements GoogleAuthService
{
	@Override
	public void RegisterGoogle(User user) 
	{
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.Register(user.getEmail(), user.getPassword());
	}

	@Override
	public void LoginGoogle(User user) 
	{
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.Login(user.getEmail(), user.getPassword());
	}
}
