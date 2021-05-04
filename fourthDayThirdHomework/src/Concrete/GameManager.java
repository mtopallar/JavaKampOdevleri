package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game)
	{
		System.out.println(game.getName() + " sisteme ba�ar�yla kaydedilmi�tir.");

	}

	@Override
	public void update(Game game)
	{
		System.out.println(game.getName() + " ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void delete(Game game)
	{
		System.out.println(game.getName() + " ba�ar� ile silinmi�itr.");

	}

}
