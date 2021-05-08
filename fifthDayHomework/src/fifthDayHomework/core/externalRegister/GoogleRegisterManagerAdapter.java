package fifthDayHomework.core.externalRegister;

import fifthDayHomework.externalRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService
{

	@Override
	public void registerWithExternalService(String userEmail)
	{
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.register(userEmail);

	}

}
