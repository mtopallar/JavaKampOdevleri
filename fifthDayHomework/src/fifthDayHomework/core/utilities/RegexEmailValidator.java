package fifthDayHomework.core.utilities;

import java.util.regex.Pattern;

public class RegexEmailValidator
{
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	public static boolean isEmailValid(String userEmail)
	{
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(userEmail).find();
	}
}
