package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService
{

	@Override
	public void update(User user)
	{
		System.out.println(user.getFirstName() + ", bilgileriniz ba�ar�yla g�ncellendi.");

	}

	@Override
	public void delete(User user)
	{
		System.out.println(user.getFirstName() + ", kayd�n�z ba�ar�yla silindi.");

	}

}
