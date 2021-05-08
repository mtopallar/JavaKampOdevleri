package fifthDayHomework;

import fifthDayHomework.business.concretes.AuthManager;
import fifthDayHomework.business.concretes.UserManager;
import fifthDayHomework.core.externalRegister.GoogleRegisterManagerAdapter;
import fifthDayHomework.dataAccess.concretes.HibernateUserDal;
import fifthDayHomework.entities.concretes.User;

public class Main
{

	public static void main(String[] args)
	{
		User user = new User();
		user.setFirstName("Murat");
		user.setLastName("Topallar");
		user.setEmail("mail@mail.com");
		user.setPassword("123456");
		user.setIsActive(false);

		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDal()));
		authManager.register(user);

		AuthManager authManager2 = new AuthManager(new UserManager(new HibernateUserDal()),
				new GoogleRegisterManagerAdapter());
		authManager2.register(user);
	}

}
