package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService
{

	@Override
	public void add(Campaign campaign)
	{
		System.out.println(campaign.getName() + " sisteme ba�ar� ile eklenmi�tir.");

	}

	@Override
	public void update(Campaign campaign)
	{
		System.out.println(campaign.getName() + " isimli kampanya bilgileri ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void delete(Campaign campaign)
	{
		System.out.println(campaign.getName() + " isimli kampanya sistemden ba�ar� ile silinmi�tir.");

	}

}
