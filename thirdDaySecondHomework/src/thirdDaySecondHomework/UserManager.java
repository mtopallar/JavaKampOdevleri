package thirdDaySecondHomework;

public class UserManager {

	public UserManager() {

	}

	public void Add(User user)
	{
		System.out.println(user.getFirstName() + " ba�ar�yla kaydoldunuz.");
	}

	public void Update(User user)
	{
		System.out.println("Bilgileriniz ba�ar�yla g�ncellendi.");
	}

	public void addLesson(Lesson lesson)
	{
		// i�i bo� b�rak�ld�. Kullan�c�ya g�re override edildi..
	}
}
