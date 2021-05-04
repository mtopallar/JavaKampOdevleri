package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService
{

	@Override
	public void update(User user)
	{
		System.out.println(user.getFirstName() + ", bilgileriniz baþarýyla güncellendi.");

	}

	@Override
	public void delete(User user)
	{
		System.out.println(user.getFirstName() + ", kaydýnýz baþarýyla silindi.");

	}

}
