import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import core.abstracts.GoogleAuthService;
import core.concretes.GoogleAuthAdapters;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args)
	{
		User user = new User(1,"Yunus","Alýcý","yunusac@51gmail.com",
				"yunusalc01","14.09.1997");
		
		UserService userService = new UserManager(new HibernateUserDao(),new ValidationManager(),
				new EmailManager(),new AuthManager());
		userService.Add(user);
		
		GoogleAuthService googleService = new GoogleAuthAdapters();
		googleService.RegisterGoogle(user);
		googleService.LoginGoogle(user);
	}
}
