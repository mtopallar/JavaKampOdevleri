package fifthDayHomework.dataAccess.concretes;

import fifthDayHomework.dataAccess.abstracts.UserDal;
import fifthDayHomework.entities.concretes.User;

public class HibernateUserDal implements UserDal
{

	@Override
	public void add(User user)
	{
		System.out.println("Kullanýcý kaydý baþarýlý.");

	}

	@Override
	public void update(User user)
	{
		System.out.println(user.getFirstName() + " bilgileriniz baþarýyla güncelleþtirilmiþtir.");

	}

	@Override
	public void delete(User user)
	{
		System.out.println(user.getFirstName() + " kaydýnýz baþarýyla silinmiþtir.");

	}

}
