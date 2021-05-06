package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.ValidationService;
import entities.concretes.User;

public class ValidationManager implements ValidationService
{
	private List<User> users = new ArrayList<User>();
	@Override
	public boolean nameLastNameCheck(User user) 
	{
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) 
		{
			System.out.println("isim ya da soy isim 2 karekterden kucuk olamaz");
            return false;
		}
		return true;
	}

	@Override
	public boolean passwordCheck(User user) 
	{
		if(user.getPassword().length()<6) 
		{
			System.out.println("Þifre 6 karakterden büyük olmalý");
            return false;
		}
		return true;
	}

	@Override
	public boolean mailCheck(User user, String mail) 
	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        if(!matcher.matches()) {
            System.out.println("Mail adresi Yanlýþ");
            return false;
        }
        for (User userMailCheck : users) 
        {
            if (mail == userMailCheck.getEmail()) 
            {
                System.out.println("Bu email ile sistemde zaten üye var !");
                return false;
            }
        }
         return true;
    }

	@Override
	public boolean verify(User user) 
	{
		if (nameLastNameCheck(user) && passwordCheck(user) && mailCheck(user,user.getEmail()))
		{
            users.add(user);
            return true;
        }
        return false;
	}
	
}
