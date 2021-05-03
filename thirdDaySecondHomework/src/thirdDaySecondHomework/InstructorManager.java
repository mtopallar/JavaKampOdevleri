package thirdDaySecondHomework;

public class InstructorManager extends UserManager {
	@Override
	public void addLesson(Lesson lesson)
	{
		System.out.println("Yeni dersiniz sisteme başarıyla eklenmiştir.");
	}

	public void updateLesson(Lesson lesson)
	{
		System.out.println("Seçtiğiniz ders başarıyla güncellendi.");
	}

	public void deleteLesson(Lesson lesson)
	{
		System.out.println("Seçtiğiniz ders sistemden başarıyla silindi.");
	}

}
