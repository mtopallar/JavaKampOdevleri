package fifthDayHomework.business.abstracts;

import fifthDayHomework.entities.concretes.User;

public interface UserService
{
	void add(User user);

	void update(User user);

	void delete(User user);

}
