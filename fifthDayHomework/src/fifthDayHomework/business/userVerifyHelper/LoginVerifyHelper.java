package fifthDayHomework.business.userVerifyHelper;

import fifthDayHomework.entities.Dtos.LoginForUserDto;

public class LoginVerifyHelper
{

	public static boolean verifyUser(LoginForUserDto loginUser)
	{
		boolean[] checklist = { isMailEntered(loginUser), isPasswordEntered(loginUser) };
		for (boolean result : checklist)
		{
			if (result)
			{
				return result;
			}
		}
		return true;
	}

	private static boolean isMailEntered(LoginForUserDto loginUser)
	{
		if (loginUser.getEmail() != null)
		{
			System.out.println("Geçerli mail adresi.");
			return true;
		}
		System.out.println("Mail adresi zorunludur..");
		return false;
	}

	private static boolean isPasswordEntered(LoginForUserDto loginUser)
	{
		if (loginUser.getPassword() != null)
		{
			System.out.println("Geçerli parola");
			return true;
		}
		System.out.println("Parola alaný zorunludur.");
		return false;
	}
}
