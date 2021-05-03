package fourthDaySecondHomework;

import java.util.Date;
import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception
	{
		BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());

		Customer customer = new Customer();
		customer.setDateOfBirth(new Date(1986 - 1 - 6));
		customer.setFirstName("Engin");
		customer.setLastName("Demiroð");
		customer.setNationalityId("123456789");

		customerManager.save(customer);
		customerManager2.save(customer);

	}

}
