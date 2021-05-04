package Concrete;

import Abstract.AuthenticationService;
import Abstract.PersonVerificationService;
import Entities.User;

public class AuthenticationManager implements AuthenticationService
{
	PersonVerificationService personVerificationService;

	public AuthenticationManager(PersonVerificationService personVerificationService)
	{
		this.personVerificationService = personVerificationService;
	}

	@Override
	public void register(User user)
	{
		if (personVerificationService.isPersonReal(user))
		{
			System.out.println(
					user.getFirstName() + " " + user.getLastName() + " kayd�n�z ba�ar�yla tamamlanm��t�r.");
		} else
		{
			System.out.println("Kimlik bilgillerinizde hata mevcut. L�tfen kontrol ediniz.");
		}

	}

}
