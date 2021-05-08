package fifthDayHomework.entities.concretes;

import fifthDayHomework.entities.abstracts.EntityBase;

public class User implements EntityBase
{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean isActive;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public boolean getIsActive()
	{
		return isActive;
	}

	public void setIsActive(boolean isActive)
	{
		this.isActive = isActive;
	}

}
