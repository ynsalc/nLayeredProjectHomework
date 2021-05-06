package business.concretes;

import business.abstracts.AuthService;
import entities.concretes.User;

public class AuthManager implements AuthService
{

	@Override
	public void Login(User user) 
	{
		if(user.isVerification()) 
		{
			System.out.println("Giri� ba�ar�l�.. Ho�geldin "+user.getFirstName());
		}
	}

}
