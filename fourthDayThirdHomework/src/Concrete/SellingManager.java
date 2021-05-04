package Concrete;

import Abstract.SellingService;
import Entities.Campaign;
import Entities.Sell;

public class SellingManager implements SellingService
{
	Campaign campaign;

	public SellingManager()
	{
		System.out.println("Kampayasýz alým gerçekleþtirildi.");
	}

	public SellingManager(Campaign campaign)
	{
		this.campaign = campaign;
		System.out.println("Kampanyalý alým gerçekleþtirildi.");
	}

	@Override
	public void sell(Sell sell)
	{
		var userFullName = sell.getUser().getFirstName() + " " + sell.getUser().getLastName();
		var gamePrice = sell.getGame().getPrice();
		var gameName = sell.getGame().getName();

		if (campaign == null)
		{
			System.out.println(userFullName + " " + gameName + " isimli oyunu satýn aldýnýz.");
			System.out.println("Tutar: " + gamePrice);
		} else
		{
			var discountedPrice = CampaignCalculatorHelper.calculate(sell.getGame(), campaign);
			System.out.println(userFullName + " " + gameName + " isimli oyunu" + campaign.getName()
					+ " kampanyasý ile indirimli aldýnýz.");
			System.out.println("Normal fiyat: " + sell.getGame().getPrice());
			System.out.println("Ýndirimli tutar: " + discountedPrice);
			System.out.println("Ýndirim oraný: %" + campaign.getDiscountAmount());
		}

	}

}
