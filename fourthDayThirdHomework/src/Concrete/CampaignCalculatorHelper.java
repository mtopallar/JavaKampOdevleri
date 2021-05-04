package Concrete;

import Entities.Campaign;
import Entities.Game;

public class CampaignCalculatorHelper
{
	public static double calculate(Game game, Campaign campaign)
	{
		var result = (game.getPrice() * campaign.getDiscountAmount()) / 100;
		return game.getPrice() - result;
	};
}
