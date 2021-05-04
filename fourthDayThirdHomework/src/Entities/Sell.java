package Entities;

import java.time.LocalDateTime;

public class Sell
{
	private int id;
	private User user;
	private Game game;
	private LocalDateTime sellingDate;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Game getGame()
	{
		return game;
	}

	public void setGame(Game game)
	{
		this.game = game;
	}

	public LocalDateTime getSellingDate()
	{
		return sellingDate;
	}

	public void setSellingDate(LocalDateTime sellingDate)
	{
		this.sellingDate = sellingDate;
	}
}
