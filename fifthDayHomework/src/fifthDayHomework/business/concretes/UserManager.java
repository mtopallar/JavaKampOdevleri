package fifthDayHomework.business.concretes;

import fifthDayHomework.business.abstracts.UserService;
import fifthDayHomework.business.userVerifyHelper.UserVerifyHelper;
import fifthDayHomework.dataAccess.abstracts.UserDal;
import fifthDayHomework.entities.concretes.User;

public class UserManager implements UserService
{
	private UserDal userDal;

	public UserManager(UserDal userDal)
	{
		this.userDal = userDal;
	}

	@Override
	public void add(User user)
	{
		userDal.add(user);

	}

	@Override
	public void update(User user)
	{
		var result = UserVerifyHelper.verifyUser(user);
		if (result)
		{
			userDal.update(user);

		} else
		{
			System.out.println("Bilgileriniz hatalý");
		}

	}

	@Override
	public void delete(User user)
	{
		userDal.delete(user);

	}

}
