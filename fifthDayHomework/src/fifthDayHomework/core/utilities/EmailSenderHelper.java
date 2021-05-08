package fifthDayHomework.core.utilities;

public class EmailSenderHelper
{
	public static void sendMail(String userEmail)
	{
		System.out.println(userEmail
				+ " sisteme kaydýnýz baþarýyla tamamlanmýþtýr. Kaydýnýzý tamamlayabilmek için linki týklayýn:");
		// burada api ile servis edilen auth service completeregistration metoduna
		// yönlendirme yapýlabilir.
	}
}
