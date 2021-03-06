package fifthDayHomework.dataAccess.concretes;

import fifthDayHomework.dataAccess.abstracts.UserDal;
import fifthDayHomework.entities.concretes.User;

public class HibernateUserDal implements UserDal
{

	@Override
	public void add(User user)
	{
		System.out.println("Kullanıcı kaydı başarılı.");

	}

	@Override
	public void update(User user)
	{
		System.out.println(user.getFirstName() + " bilgileriniz başarıyla güncelleştirilmiştir.");

	}

	@Override
	public void delete(User user)
	{
		System.out.println(user.getFirstName() + " kaydınız başarıyla silinmiştir.");

	}

}
