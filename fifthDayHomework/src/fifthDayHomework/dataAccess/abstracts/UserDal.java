package fifthDayHomework.dataAccess.abstracts;

import fifthDayHomework.entities.concretes.User;

public interface UserDal
{
	void add(User user);

	void update(User user);

	void delete(User user);

	// ge�ek bir projede olan getAll, getById gibi db ba�lant�l� metodlar
	// sim�lasyona eklenmedi.

}
