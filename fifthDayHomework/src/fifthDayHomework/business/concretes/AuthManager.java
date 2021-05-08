package fifthDayHomework.business.concretes;

import fifthDayHomework.business.abstracts.AuthService;
import fifthDayHomework.business.abstracts.UserService;
import fifthDayHomework.business.userVerifyHelper.LoginVerifyHelper;
import fifthDayHomework.business.userVerifyHelper.UserVerifyHelper;
import fifthDayHomework.core.externalRegister.RegisterService;
import fifthDayHomework.core.utilities.EmailSenderHelper;
import fifthDayHomework.entities.Dtos.LoginForUserDto;
import fifthDayHomework.entities.concretes.User;

public class AuthManager implements AuthService
{
	private UserService userService;
	private RegisterService registerService;

	public AuthManager(UserService userService)
	{
		this.userService = userService;

	}

	public AuthManager(UserService userService, RegisterService registerService)
	{
		this.userService = userService;
		this.registerService = registerService;
	}

	@Override
	public void register(User user)
	{

		if (registerService == null)
		{
			var result = UserVerifyHelper.verifyUser(user);

			if (result)
			{
				userService.add(user);
				EmailSenderHelper.sendMail(user.getEmail());

			} else
			{

				System.out.println("Bilgilerinizi kontrol ediniz.");
			}
		} else
		{
			registerService.registerWithExternalService(user.getEmail());
		}

	}

	@Override
	public void login(LoginForUserDto loginUser)
	{

		var result = LoginVerifyHelper.verifyUser(loginUser);
		if (result)
		{
			System.out.println("Giriþ baþarýlý");
		} else
		{
			System.out.println("Giriþ bilgileriniz hatalý.");
		}

	}

	@Override
	public void completeRegistration(User user)
	{
		// Normalde db den user id ye göre çaðýrýlýr ve isActive özelliði enable olarak
		// deðiþtirilip db ye set edilir.
		User updatedUser = new User();
		updatedUser.setId(user.getId());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setPassword(user.getPassword());
		updatedUser.setIsActive(true);

		userService.update(updatedUser);
		System.out.println("Aktivasyon baþarýyla tamamlandý.");

		// sistemde user yoksa veya update metodundan hata dönerse hata bilgilendirmesi
		// yapýlýr.
	}

}
