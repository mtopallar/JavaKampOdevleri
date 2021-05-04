package fourthDayThirdHomework;

import java.time.LocalDateTime;

import Concrete.AuthenticationManager;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PersonVerificationManager;
import Concrete.SellingManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sell;
import Entities.User;

public class Main
{

	public static void main(String[] args)
	{
		// GAMES

		Game witcher3 = new Game();
		witcher3.setId(1);
		witcher3.setGenre("RPG/Aksiyon");
		witcher3.setName("Witcher 3");
		witcher3.setPrice(80);

		Game citiesSkylines = new Game();
		citiesSkylines.setId(2);
		citiesSkylines.setGenre("Sim�lasyon");
		citiesSkylines.setName("Cities Skylines");
		citiesSkylines.setPrice(100);

		// CAMPAIGNS

		Campaign fridayCampaign = new Campaign();
		fridayCampaign.setId(1);
		fridayCampaign.setName("Friday Discount!");
		fridayCampaign.setDiscountAmount(35);

		Campaign midOfTheWeek = new Campaign();
		midOfTheWeek.setId(2);
		midOfTheWeek.setName("Mid of The Week Discount!");
		midOfTheWeek.setDiscountAmount(25);

		Campaign endOfTheSeason = new Campaign();
		endOfTheSeason.setId(3);
		endOfTheSeason.setName("End Of The Season!!");
		endOfTheSeason.setDiscountAmount(80);

		// USERS

		User murat = new User();
		murat.setId(1);
		murat.setFirstName("Murat");
		murat.setLastName("Topallar");
		murat.setPassword("123456");
		murat.setAge(34); // Ya� 18 den k���k ise kay�t ger�ekle�meyecek.

		User engin = new User();
		engin.setId(2);
		engin.setFirstName("Engin");
		engin.setLastName("Demiro�");
		engin.setPassword("654321");
		engin.setAge(35); // Ya� 18 den k���k ise kay�t ger�ekle�meyecek.

		// SELLS

		Sell sellToMurat = new Sell();
		sellToMurat.setId(1);
		sellToMurat.setUser(murat);
		sellToMurat.setGame(citiesSkylines);
		sellToMurat.setSellingDate(LocalDateTime.now());

		Sell sellToEngin = new Sell();
		sellToEngin.setId(2);
		sellToEngin.setUser(engin);
		sellToEngin.setGame(witcher3);
		sellToEngin.setSellingDate(LocalDateTime.now());

		// Managers

		AuthenticationManager authManager = new AuthenticationManager(new PersonVerificationManager());
		authManager.register(murat);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(endOfTheSeason);
		campaignManager.update(midOfTheWeek);
		campaignManager.delete(fridayCampaign);

		GameManager gameManager = new GameManager();
		gameManager.add(witcher3);
		gameManager.update(witcher3);
		gameManager.delete(witcher3);

		UserManager userManager = new UserManager();
		userManager.update(murat);
		userManager.delete(engin);

		SellingManager sellingManager = new SellingManager();
		sellingManager.sell(sellToMurat);
		sellingManager.sell(sellToEngin);

		SellingManager sellingWithCampaign = new SellingManager(endOfTheSeason);
		sellingWithCampaign.sell(sellToEngin);

		SellingManager sellingManagerWithCampaign2 = new SellingManager(midOfTheWeek);
		sellingManagerWithCampaign2.sell(sellToMurat);

		// Selling nesnesi yerine User ve Game parametreleri kullan�larak sat��
		// ger�ekle�tirmek de m�mk�n, ben sell ad�nda bir obje olu�turup game ve user �
		// sell in i�ine g�merek kulland�m. Do�rulama olarak ya��n 18 ya� �zerinde olup
		// olmamas� �eklinde bir sim�lasyon ger�ekle�tirdim.
	}

}
