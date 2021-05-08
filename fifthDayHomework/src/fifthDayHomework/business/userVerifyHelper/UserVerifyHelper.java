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
			System.out.println("Kullanýcý adý geçerli");
			return true;
		}
		System.out.println("Kullanýcý adý en az 2 karakter olmalýdýr.");
		return false;
	}

	private static boolean verifyUserLastName(User user)
	{
		if (user.getLastName().length() >= 2)
		{
			System.out.println("Kullanýcý soyadý geçerli");
			return true;
		}
		System.out.println("Kullanýcý soyadý en az 2 karakter olmalýdýr.");
		return false;
	}

	private static boolean verifyUserPassword(User user)
	{
		if (user.getPassword().length() >= 6)
		{
			System.out.println("Kullanýcý parolasý geçerli");
			return true;
		}
		System.out.println("Kullanýcý parolasý en az 6 karakter olmalýdýr.");
		return false;
	}

	private static boolean verifyUserMail(User user)
	{
		var result = RegexEmailValidator.isEmailValid(user.getEmail());
		if (result)
		{
			System.out.println("Email geçerli");
			return true;
		}
		System.out.println("Hatalý e mail. Lütfen kontrol ediniz.");
		return true;
	}

	private static boolean isMailUnique()
	{
		System.out.println("Mail adresi daha önce kullanýlmamýþ.");
		return true; // simülasyon
	}

}
