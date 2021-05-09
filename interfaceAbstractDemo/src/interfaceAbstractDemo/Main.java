package interfaceAbstractDemo;

import java.time.LocalDate;

import Abstracts.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		 
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();		
		baseCustomerManager2.save(new Customer(1, "Yýldýray", "Çýrakoðullarý",LocalDate.of(1991,5,30), "11111111111"));
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());		
		baseCustomerManager1.save(new Customer(1, "Tuðba", "Çýrakoðullarý",LocalDate.of(1990,1,21), "22222222222"));
		
	}

}
