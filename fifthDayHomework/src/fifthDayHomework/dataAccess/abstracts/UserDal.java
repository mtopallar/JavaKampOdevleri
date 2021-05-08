package fifthDayHomework.dataAccess.abstracts;

import fifthDayHomework.entities.concretes.User;

public interface UserDal
{
	void add(User user);

	void update(User user);

	void delete(User user);

	// geçek bir projede olan getAll, getById gibi db baðlantýlý metodlar
	// simülasyona eklenmedi.

}
