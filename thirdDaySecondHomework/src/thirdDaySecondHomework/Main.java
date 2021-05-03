package thirdDaySecondHomework;

public class Main {

	public static void main(String[] args)
	{
		User user = new User();
		user.setId(1);
		user.setFirstName("Murat");
		user.setLastName("Topallar");
		user.setEmail("murat@mail.com");
		user.setPassword("12345");

		Lesson lesson1 = new Lesson();
		lesson1.setId(1);
		lesson1.setName("C# ve Angular kursu");

		Lesson lesson2 = new Lesson();
		lesson2.setId(2);
		lesson2.setName("Java ve React kursu");

		Lesson lesson3 = new Lesson();
		lesson3.setId(3);
		lesson3.setName("Programlamaya giriþ kurus");

		// Lesson[] lessons = new Lesson[] {lesson1,lesson2,lesson3};

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@mail.com");
		instructor.setPassword("123456");
		instructor.setLessonsToGive(new Lesson[] { lesson1, lesson2, lesson3 });

		UserManager userManager = new UserManager();
		userManager.Add(user);
		userManager.Add(instructor);

		UserManager[] managers = new UserManager[] { new StudentManager(), new InstructorManager() };

		for (UserManager manager : managers)
		{
			manager.addLesson(lesson1);
		}
	}

}
