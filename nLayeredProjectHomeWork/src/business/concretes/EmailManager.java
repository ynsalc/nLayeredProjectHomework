package business.concretes;

import java.util.Scanner;

import business.abstracts.MailService;
import entities.concretes.User;

public class EmailManager implements MailService
{

	@Override
	public void Send(User user) 
	{
		System.out.println("Do�rulama maili g�nderildi mail adresinizi kontrol ediniz.");
		Scanner kod = new Scanner(System.in);
		int code;
		System.out.println("Do�rulama kodunu giriniz..");
		code = kod.nextInt();
		VerifyMailController(user,code);
	}

	@Override
	public boolean VerifyMailController(User user,int code) 
	{
		if(code==1) 
		{
		    System.out.println("Hesab�n�z do�ruland� giri� sayfas�na y�nlendiriliyorsunuz.");
		    user.setVerification(true);
		    return true;
		}
		System.out.println("Do�rulama yap�lamad�.");
		return false;
	}

}
