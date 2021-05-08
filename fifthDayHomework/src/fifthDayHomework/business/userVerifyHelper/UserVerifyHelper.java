package fifthDayHomework.business.userVerifyHelper;

import fifthDayHomework.core.utilities.RegexEmailValidator;
import fifthDayHomework.entities.concretes.User;

public class UserVerifyHelper
{
	public static boolean verifyUser(User user)
	{
		boolean[] checklist = {
				verifyUserFirstName(user), verifyUserLastName(user), verifyUserPassword(user),
				verifyUserMail(user), isMailUnique() };
		for (boolean result : checklist)
		{
			if (!result)
			{
				return result;
			}
		}
		return true;
	}

	private static boolean verifyUserFirstName(User user)
	{
		if (user.getFirstName().length() >= 2)
		{
			System.out.println("Kullan�c� ad� ge�erli");
			return true;
		}
		System.out.println("Kullan�c� ad� en az 2 karakter olmal�d�r.");
		return false;
	}

	private static boolean verifyUserLastName(User user)
	{
		if (user.getLastName().length() >= 2)
		{
			System.out.println("Kullan�c� soyad� ge�erli");
			return true;
		}
		System.out.println("Kullan�c� soyad� en az 2 karakter olmal�d�r.");
		return false;
	}

	private static boolean verifyUserPassword(User user)
	{
		if (user.getPassword().length() >= 6)
		{
			System.out.println("Kullan�c� parolas� ge�erli");
			return true;
		}
		System.out.println("Kullan�c� parolas� en az 6 karakter olmal�d�r.");
		return false;
	}

	private static boolean verifyUserMail(User user)
	{
		var result = RegexEmailValidator.isEmailValid(user.getEmail());
		if (result)
		{
			System.out.println("Email ge�erli");
			return true;
		}
		System.out.println("Hatal� e mail. L�tfen kontrol ediniz.");
		return true;
	}

	private static boolean isMailUnique()
	{
		System.out.println("Mail adresi daha �nce kullan�lmam��.");
		return true; // sim�lasyon
	}

}
