package thirdDaySecondHomework;

public class InstructorManager extends UserManager {
	@Override
	public void addLesson(Lesson lesson)
	{
		System.out.println("Yeni dersiniz sisteme ba�ar�yla eklenmi�tir.");
	}

	public void updateLesson(Lesson lesson)
	{
		System.out.println("Se�ti�iniz ders ba�ar�yla g�ncellendi.");
	}

	public void deleteLesson(Lesson lesson)
	{
		System.out.println("Se�ti�iniz ders sistemden ba�ar�yla silindi.");
	}

}
