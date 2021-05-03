package thirdDaySecondHomework;

public class InstructorManager extends UserManager {
	@Override
	public void addLesson(Lesson lesson)
	{
		System.out.println("Yeni dersiniz sisteme baþarýyla eklenmiþtir.");
	}

	public void updateLesson(Lesson lesson)
	{
		System.out.println("Seçtiðiniz ders baþarýyla güncellendi.");
	}

	public void deleteLesson(Lesson lesson)
	{
		System.out.println("Seçtiðiniz ders sistemden baþarýyla silindi.");
	}

}
