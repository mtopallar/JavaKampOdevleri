package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game)
	{
		System.out.println(game.getName() + " sisteme baþarýyla kaydedilmiþtir.");

	}

	@Override
	public void update(Game game)
	{
		System.out.println(game.getName() + " baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Game game)
	{
		System.out.println(game.getName() + " baþarý ile silinmiþitr.");

	}

}
