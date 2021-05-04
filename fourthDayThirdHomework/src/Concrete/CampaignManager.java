package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService
{

	@Override
	public void add(Campaign campaign)
	{
		System.out.println(campaign.getName() + " sisteme baþarý ile eklenmiþtir.");

	}

	@Override
	public void update(Campaign campaign)
	{
		System.out.println(campaign.getName() + " isimli kampanya bilgileri baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Campaign campaign)
	{
		System.out.println(campaign.getName() + " isimli kampanya sistemden baþarý ile silinmiþtir.");

	}

}
