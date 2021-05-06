package core.abstracts;

import entities.concretes.User;

public interface GoogleAuthService 
{
	void RegisterGoogle(User user);
	void LoginGoogle(User user);
}
