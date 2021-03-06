package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService
{

	@Override
	public void add(Campaign campaign)
	{
		System.out.println(campaign.getName() + " sisteme başarı ile eklenmiştir.");

	}

	@Override
	public void update(Campaign campaign)
	{
		System.out.println(campaign.getName() + " isimli kampanya bilgileri başarıyla güncellenmiştir.");

	}

	@Override
	public void delete(Campaign campaign)
	{
		System.out.println(campaign.getName() + " isimli kampanya sistemden başarı ile silinmiştir.");

	}

}
