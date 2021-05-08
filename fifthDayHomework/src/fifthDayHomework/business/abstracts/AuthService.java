package fifthDayHomework.business.abstracts;

import fifthDayHomework.entities.Dtos.LoginForUserDto;
import fifthDayHomework.entities.concretes.User;

public interface AuthService
{
	void register(User user);

	void login(LoginForUserDto loginUser);

	void completeRegistration(User user);
}
