package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game)
	{
		System.out.println(game.getName() + " sisteme başarıyla kaydedilmiştir.");

	}

	@Override
	public void update(Game game)
	{
		System.out.println(game.getName() + " başarıyla güncellenmiştir.");

	}

	@Override
	public void delete(Game game)
	{
		System.out.println(game.getName() + " başarı ile silinmişitr.");

	}

}
