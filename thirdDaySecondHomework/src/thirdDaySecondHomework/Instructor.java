package thirdDaySecondHomework;

public class Instructor extends User {
	private Lesson[] lessonsToGive; // normalde b�yle tutulmaz sim�le edildi.

	public Lesson[] getLessonsToGive()
	{
		return lessonsToGive;
	}

	public void setLessonsToGive(Lesson[] lessonsToGive)
	{
		this.lessonsToGive = lessonsToGive;
	}

}
