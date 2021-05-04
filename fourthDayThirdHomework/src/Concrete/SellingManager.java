package Concrete;

import Abstract.SellingService;
import Entities.Campaign;
import Entities.Sell;

public class SellingManager implements SellingService
{
	Campaign campaign;

	public SellingManager()
	{
		System.out.println("Kampayas�z al�m ger�ekle�tirildi.");
	}

	public SellingManager(Campaign campaign)
	{
		this.campaign = campaign;
		System.out.println("Kampanyal� al�m ger�ekle�tirildi.");
	}

	@Override
	public void sell(Sell sell)
	{
		var userFullName = sell.getUser().getFirstName() + " " + sell.getUser().getLastName();
		var gamePrice = sell.getGame().getPrice();
		var gameName = sell.getGame().getName();

		if (campaign == null)
		{
			System.out.println(userFullName + " " + gameName + " isimli oyunu sat�n ald�n�z.");
			System.out.println("Tutar: " + gamePrice);
		} else
		{
			var discountedPrice = CampaignCalculatorHelper.calculate(sell.getGame(), campaign);
			System.out.println(userFullName + " " + gameName + " isimli oyunu" + campaign.getName()
					+ " kampanyas� ile indirimli ald�n�z.");
			System.out.println("Normal fiyat: " + sell.getGame().getPrice());
			System.out.println("�ndirimli tutar: " + discountedPrice);
			System.out.println("�ndirim oran�: %" + campaign.getDiscountAmount());
		}

	}

}
