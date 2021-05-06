package business.abstracts;

import entities.concretes.User;

public interface MailService 
{
	void Send(User user);
	boolean VerifyMailController(User user,int code);
}
