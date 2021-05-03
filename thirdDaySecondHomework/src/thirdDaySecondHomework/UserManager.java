package thirdDaySecondHomework;

public class UserManager {

	public UserManager() {

	}

	public void Add(User user)
	{
		System.out.println(user.getFirstName() + " baþarýyla kaydoldunuz.");
	}

	public void Update(User user)
	{
		System.out.println("Bilgileriniz baþarýyla güncellendi.");
	}

	public void addLesson(Lesson lesson)
	{
		// içi boþ býrakýldý. Kullanýcýya göre override edildi..
	}
}
