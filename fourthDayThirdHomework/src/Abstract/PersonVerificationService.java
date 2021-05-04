package Abstract;

import Entities.User;

public interface PersonVerificationService
{
	boolean isPersonReal(User user);
}
