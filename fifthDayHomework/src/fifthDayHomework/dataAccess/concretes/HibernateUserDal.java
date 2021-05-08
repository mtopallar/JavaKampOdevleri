package fifthDayHomework.dataAccess.concretes;

import fifthDayHomework.dataAccess.abstracts.UserDal;
import fifthDayHomework.entities.concretes.User;

public class HibernateUserDal implements UserDal
{

	@Override
	public void add(User user)
	{
		System.out.println("Kullan�c� kayd� ba�ar�l�.");

	}

	@Override
	public void update(User user)
	{
		System.out.println(user.getFirstName() + " bilgileriniz ba�ar�yla g�ncelle�tirilmi�tir.");

	}

	@Override
	public void delete(User user)
	{
		System.out.println(user.getFirstName() + " kayd�n�z ba�ar�yla silinmi�tir.");

	}

}
