package com.frota.algohithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.frota.algohithm.gpsCustomer.control.CustomerController;
import com.frota.algohithm.gpsCustomer.model.Customer;
import com.frota.algohithm.gpsCustomer.utils.ReadFileCustomer;

/**
 * 
 * @author edmundofrota
 *
 */
public class AppGPS 
{
	
	public static void main(String[] args)
	{
		final String jsonFileName = "customers";
		
		try 
		{
			//read file containing the list of customers
			List<Customer> customers = new ReadFileCustomer().readFile(jsonFileName);
			
			//returns customers who are 100km closer to target (Dublin Office)
			HashMap<Long, Customer> closeCustomers = new CustomerController().closerCustomers(53.3381985, -6.2592576, customers, 100);
			
			//print customers
			Iterator<Long> keySetIterator = closeCustomers.keySet().iterator();
			while(keySetIterator.hasNext())
			{
				Long key = keySetIterator.next();
				
				System.out.println("User ID	: " + closeCustomers.get(key).getId());
				System.out.println("Name	: " + closeCustomers.get(key).getName());
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
}
