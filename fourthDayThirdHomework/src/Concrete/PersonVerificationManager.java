package Concrete;

import Abstract.PersonVerificationService;
import Entities.User;

public class PersonVerificationManager implements PersonVerificationService
{

	@Override
	public boolean isPersonReal(User user)
	{
		if (user.getAge() >= 18)
		{
			return true;
		}
		return false;
	}

}
